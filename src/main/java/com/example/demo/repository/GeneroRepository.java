package com.example.demo.repository;

import com.example.demo.entity.Genero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends CrudRepository<Genero, Long> {
}
