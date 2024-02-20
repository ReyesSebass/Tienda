package com.tienda.service;

import com.tienda.domain.Categorias;
import java.util.List;

public interface CategoriaService {
    
    
    public List<Categorias> getCategorias(boolean activos);
}
