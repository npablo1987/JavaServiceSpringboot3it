package com.example.demo.service.impl;

import com.example.demo.entity.Genero;
import com.example.demo.repository.GeneroRepository;
import com.example.demo.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {
    @Autowired
    private GeneroRepository generoRepository;

    @Override
    public List<Genero> getGenero() {
        return (List<Genero>) generoRepository.findAll();
    }

    @Override
    public Genero getGenero(Long id) {
        return generoRepository.findById(id).orElse(null);
    }

    @Override
    public Genero addGenero(Genero encuesta) {
        return generoRepository.save(encuesta);
    }

    @Override
    public Genero updateGenero(Genero encuesta) {
        if (getGenero(encuesta.getId()) != null) {
            return generoRepository.save(encuesta);
        }
        return null;
    }

    @Override
    public boolean deleteGenero(Long id) {
        if (getGenero(id) != null) {
            generoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
