package com.prueba.exceptions;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
public class Exceptions extends RuntimeException{

    private HttpStatus httpStatus;
    private String mensaje;
    private int codigoError;


}
