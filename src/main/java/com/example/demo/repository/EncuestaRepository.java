package com.example.demo.repository;

import com.example.demo.entity.Encuesta;
import jdk.jfr.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface EncuestaRepository extends CrudRepository<Encuesta, Long>, JpaSpecificationExecutor {


    @Query(value ="SELECT COUNT(encuesta.genero_id) , genero.descripcion FROM encuesta  INNER JOIN genero ON encuesta.genero_id = genero.id GROUP BY genero.descripcion", nativeQuery = true)
    List<Object[]> findGetDashboard();
}
