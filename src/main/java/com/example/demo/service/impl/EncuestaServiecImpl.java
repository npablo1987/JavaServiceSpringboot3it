package com.example.demo.service.impl;

import com.example.demo.entity.Encuesta;
import com.example.demo.repository.EncuestaRepository;
import com.example.demo.service.EncuestaService;
import jdk.jfr.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncuestaServiecImpl implements EncuestaService {
    @Autowired
    private EncuestaRepository encuestaRepository;

    @Override
    public List<Encuesta> getEncuesta() {
        return (List<Encuesta>) encuestaRepository.findAll();
    }

    @Override
    public List<Object[]> getDashboard() { return  (List<Object[]>) encuestaRepository.findGetDashboard(); }

    @Override
    public Encuesta getEncuesta(Long id) {
        return encuestaRepository.findById(id).orElse(null);
    }

    @Override
    public Encuesta addEncuesta(Encuesta encuesta) {
        return encuestaRepository.save(encuesta);
    }

    @Override
    public Encuesta updateEncuesta(Encuesta encuesta) {
        if (getEncuesta(encuesta.getId()) != null) {
            return encuestaRepository.save(encuesta);
        }
        return null;
    }

    @Override
    public boolean deleteEncuesta(Long id) {
        if (getEncuesta(id) != null) {
            encuestaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
