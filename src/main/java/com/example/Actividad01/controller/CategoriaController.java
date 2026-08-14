package com.example.Actividad01.controller;

import com.example.Actividad01.entity.Categoria;
import com.example.Actividad01.service.service.CategoriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }
    @GetMapping
    public Iterable<Categoria> getCategorias(){
        return categoriaService.readAll();
    }
}
