package com.example.demo.controller;

import com.example.demo.entity.Genero;
import com.example.demo.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/genero")
public class GeneroController {
    @Autowired
    private GeneroService generoService;

    @GetMapping("listar")
    public List<Genero> getGenero() {
        return generoService.getGenero();
    }

    @GetMapping("listar/{id}")
    public Genero getGenero(@PathVariable Long id) {
        return generoService.getGenero(id);
    }

    @PostMapping("agregar")
    public Genero addGenero(@RequestBody Genero genero) {
        return generoService.addGenero(genero);
    }

    @PutMapping("actualizar")
    public Genero updateGenero(@RequestBody Genero genero) {
        return generoService.updateGenero(genero);
    }

    @DeleteMapping("eliminar/{id}")
    public boolean deleteGenero(@PathVariable Long id) {
        return generoService.deleteGenero(id);
    }
}
