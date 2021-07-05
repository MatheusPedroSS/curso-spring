package com.pedro.cursomc.services;

import java.util.Optional;

import com.pedro.cursomc.domain.Categoria;
import com.pedro.cursomc.repositories.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repository;

    public Categoria find(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElse(null);
    }

}
