package com.prueba.services;

import com.prueba.Dto.EscriturasDto;
import com.prueba.entity.Escrituras;
import com.prueba.exceptions.Exceptions;
import com.prueba.repository.EscriturasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EscriturasService {

    @Autowired
    private EscriturasRepository escriturasRepository;

    public ResponseEntity<?>ListAll(){
       List<Escrituras> Lista = escriturasRepository.findAll();
        if (Lista.isEmpty()) {
            throw new Exceptions(HttpStatus.NOT_FOUND, "No se encontraron registros de escrituras", 404);
        }
        return ResponseEntity.ok(Lista);
    }

    public ResponseEntity<?>ListGenero(String genero){
        List<EscriturasDto> ListGenero =  escriturasRepository.findByGenero(genero);

        if (ListGenero.isEmpty()) {
            throw new Exceptions(HttpStatus.NOT_FOUND, "No se encontraron registros de escrituras con el género " + genero, 404);
        }
        ListGenero =  ListGenero.stream()
                .map(
                        Es -> EscriturasDto.builder()
                                .genero(Es.getGenero())
                                .created(Es.getCreated())
                                .build())
                .collect(Collectors.toList());
        return ResponseEntity.ok(ListGenero);
    }

    public ResponseEntity<?> createEscrituras(EscriturasDto escriturasDto){
        if (escriturasDto.getGenero() == null || escriturasDto.getGenero().isEmpty()) {
            throw new Exceptions(HttpStatus.BAD_REQUEST,"El género es obligatorio", 400);
        }
        escriturasRepository.save(
                Escrituras.builder()
                        .genero(escriturasDto.getGenero())
                        .created(LocalDateTime.now())
                        .build()
        );

        return ResponseEntity.ok("Se ha creado un registro exito");
    }
}
