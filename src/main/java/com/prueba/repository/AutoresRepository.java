package com.prueba.repository;

import com.prueba.entity.Autores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoresRepository extends JpaRepository<Autores, Long> {
}
