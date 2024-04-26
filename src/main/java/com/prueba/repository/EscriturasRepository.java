package com.prueba.repository;

import com.prueba.entity.Autores;
import com.prueba.entity.Escrituras;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscriturasRepository extends JpaRepository<Escrituras, Long> {
}
