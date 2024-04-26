package com.prueba.Dto;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class AutoresDto {

    private String nombre;
    private String email;
    private String celular;
    private String nacionalidad;
    private Long escrituras;

}
