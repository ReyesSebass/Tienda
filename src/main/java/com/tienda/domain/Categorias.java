package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categorias implements Serializable{
    
    private static final long serialVersionULD = 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long id_Categoria;
    private String descrpion;
    private String rutaImagen;
    private boolean activo;
    
    public Categorias(){
        
    }

    public Categorias(String descrpion, String rutaImagen, boolean activo) {
        this.descrpion = descrpion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
    
}
