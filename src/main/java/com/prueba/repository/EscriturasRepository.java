package com.prueba.repository;

import com.prueba.Dto.EscriturasDto;
import com.prueba.entity.Autores;
import com.prueba.entity.Escrituras;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EscriturasRepository extends JpaRepository<Escrituras, Long> {
    List<EscriturasDto> findByGenero(String genero);
}
