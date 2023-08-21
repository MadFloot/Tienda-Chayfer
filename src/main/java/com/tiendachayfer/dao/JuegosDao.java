/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tiendachayfer.dao;

import com.tiendachayfer.domain.Juegos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author HUAWEI PC
 */
public interface JuegosDao extends JpaRepository <Juegos,Long>{
    
    public List<Juegos> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    //FALTA
}
