package com.example.Actividad01.service.impl;

import com.example.Actividad01.entity.Categoria;
import com.example.Actividad01.repository.CategoriaRepository;
import com.example.Actividad01.service.service.CategoriaService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CategoriaServiceImpl implements CategoriaService {
    private final CategoriaRepository categoriaRepository;
    public CategoriaServiceImpl (CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }
    @Override
    public Categoria create(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria update(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Optional<Categoria> read(Long aLong) {
        return categoriaRepository.findById(aLong);
    }

    @Override
    public void delete(Long aLong) {
        categoriaRepository.deleteById(aLong);
    }

    @Override
    public Iterable<Categoria> readAll() {
        return categoriaRepository.findAll();
    }
}
