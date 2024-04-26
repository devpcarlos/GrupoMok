package com.prueba.services;

import com.prueba.Dto.EscriturasDto;
import com.prueba.entity.Escrituras;
import com.prueba.repository.EscriturasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EscriturasService {

    @Autowired
    private EscriturasRepository escriturasRepository;

    public ResponseEntity<?> createAutores(EscriturasDto escriturasDto){

        escriturasRepository.save(
                Escrituras.builder()
                        .genero(escriturasDto.getGenero())
                        .created(LocalDateTime.now())
                        .build()
        );

        return ResponseEntity.ok("Se ha creado un registro exito");
    }
}
