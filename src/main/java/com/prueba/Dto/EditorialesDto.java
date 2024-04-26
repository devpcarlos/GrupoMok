package com.prueba.Dto;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class EditorialesDto {

    private String nombre;
    private String Direccion;
    private Long libros;

}
