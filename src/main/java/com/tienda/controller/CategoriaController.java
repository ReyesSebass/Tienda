package com.tienda.controller;

import com.tienda.domain.Categorias;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
     CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String listado(Model model) {
        List<Categorias> lista = categoriaService.getCategorias(false);
        model.addAttribute("categorias", lista);
        return "/categoria/registro";
    }
    
}
