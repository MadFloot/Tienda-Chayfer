package com.tiendachayfer.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author HUAWEI PC
 */
@Data
@Entity
@Table(name="juegos")
public class Juegos implements Serializable{
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_juegos")
    
    private Long idJuegos;
    private String nombreJ;
    private String descripcion;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;

    public Juegos() {
    }

    public Juegos(String nombreJ, String descripcion, double precio, int existencias, String rutaImagen, boolean activo) {
        this.nombreJ = nombreJ;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
}
