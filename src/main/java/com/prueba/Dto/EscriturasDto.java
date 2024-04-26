package com.prueba.Dto;

import com.prueba.entity.Autores;
import com.prueba.entity.Libros;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;


@Builder
@Data
public class EscriturasDto {

    private String genero;
    private LocalDateTime created;
    private List<Autores> autores;
    private List<Libros> libros;
}
