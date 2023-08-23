package com.tiendachayfer.service.impl;

import com.tiendachayfer.domain.Producto;
import com.tiendachayfer.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tiendachayfer.dao.ProductoDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @PersistenceContext
    private EntityManager entityManager; // Inyecta el EntityManager

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductosByEsParaBebe(boolean esParaBebe) {
        String jpql = "SELECT p FROM Producto p WHERE p.esParaBebe = :esParaBebe";
        TypedQuery<Producto> query = entityManager.createQuery(jpql, Producto.class);
        query.setParameter("esParaBebe", esParaBebe);
        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activos) {
        var lista = productoDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }

    //Se implementa un metodo para recuperar los productos con una consulta ampliada
    @Override
    @Transactional(readOnly = true)
    public List<Producto> buscaProductosPorPrecioEntre(double precioInf, double precioSup) {
        return productoDao.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
    }
    //Se implementa un metodo para recuperar los productos con una consulta jpql

    @Override
    @Transactional(readOnly = true)
    public List<Producto> consultaJPQL(double precioInf, double precioSup) {
        return productoDao.metodoJPQL(precioInf, precioSup);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> metodoNativo(double precioInf, double precioSup) {
        return productoDao.metodoNativo(precioInf, precioSup);
    }

   

}
