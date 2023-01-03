package com.example.demo.service;

import com.example.demo.entity.Encuesta;
import com.example.demo.entity.Genero;

import java.util.List;

public interface GeneroService {
    public List<Genero> getGenero();
    public Genero getGenero(Long id);
    public Genero addGenero(Genero encuesta);
    public Genero updateGenero(Genero encuesta);
    public boolean deleteGenero(Long id);
}
