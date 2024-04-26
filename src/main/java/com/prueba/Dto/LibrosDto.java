package com.prueba.Dto;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class LibrosDto {

    private String titulo;
    private String isbn;
    private Long escrituras;
    private Long editoriales;
}
