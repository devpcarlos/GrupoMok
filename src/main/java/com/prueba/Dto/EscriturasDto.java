package com.prueba.Dto;

import com.prueba.entity.Autores;
import com.prueba.entity.Libros;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;


@Builder
@Getter
public class EscriturasDto {

    @NotBlank(message = "Este campo no puede ir en blanco")
    private String genero;
    private LocalDateTime created;
}
