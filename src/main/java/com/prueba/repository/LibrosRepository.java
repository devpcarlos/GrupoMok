package com.prueba.repository;

import com.prueba.entity.Autores;
import com.prueba.entity.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrosRepository extends JpaRepository<Libros, Long> {
}
