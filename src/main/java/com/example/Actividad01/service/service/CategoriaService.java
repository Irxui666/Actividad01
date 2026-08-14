package com.example.Actividad01.service.service;

import com.example.Actividad01.entity.Categoria;
import com.example.Actividad01.service.generic.CrudService;
import org.springframework.stereotype.Service;

@Service

public interface CategoriaService extends CrudService<Categoria, Long> {
}
