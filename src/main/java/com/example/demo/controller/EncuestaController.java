package com.example.demo.controller;

import com.example.demo.entity.Encuesta;
import com.example.demo.service.EncuestaService;
import jdk.jfr.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/encuesta")
public class EncuestaController {
    @Autowired
    private EncuestaService encuestaService;

    @GetMapping("listar")
    public Iterable<Encuesta> getEncuesta() {
        return encuestaService.getEncuesta();
    }

    @GetMapping("datag")
    public Iterable<Object[]> getDashboard(){ return encuestaService.getDashboard();}

    @GetMapping("listar/{id}")
    public Encuesta getEncuesta(@PathVariable Long id) {
        return encuestaService.getEncuesta(id);
    }

    @PostMapping("agregar")
    public Encuesta addEncuesta(@RequestBody Encuesta encuesta) {
        return encuestaService.addEncuesta(encuesta);
    }

    @PutMapping("actualizar")
    public Encuesta updateEncuesta(@RequestBody Encuesta encuesta) {
        return encuestaService.updateEncuesta(encuesta);
    }

    @DeleteMapping("eliminar/{id}")
    public boolean deleteEncuesta(@PathVariable Long id) {
        return encuestaService.deleteEncuesta(id);
    }

}
