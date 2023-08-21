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
@Table(name="giftcards")
public class Giftcards implements Serializable{
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_giftcards")
    
    private Long idGiftcards;
    private String descripcion;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;

    public Giftcards() {
    }

    public Giftcards(String descripcion, double precio, int existencias, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo= activo;
    }
    
    
}
