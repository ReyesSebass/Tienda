package com.tienda.dao;

import com.tienda.domain.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaDao extends JpaRepository<Categorias, Long>{
    
}
