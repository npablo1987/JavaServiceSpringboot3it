package com.example.demo.service;

import com.example.demo.entity.Encuesta;
import jdk.jfr.Event;

import java.util.List;

public interface EncuestaService {
    public List<Encuesta> getEncuesta();
    public List<Object[]> getDashboard();
    public Encuesta getEncuesta(Long id);
    public Encuesta addEncuesta(Encuesta encuesta);
    public Encuesta updateEncuesta(Encuesta encuesta);
    public boolean deleteEncuesta(Long id);
}
