package com.prueba.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "libros")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Libros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String isbn;
    @ManyToOne(targetEntity = Escrituras.class)
    @JsonIgnore
    private Escrituras escrituras;

    @ManyToOne(targetEntity = Editoriales.class)
    @JsonIgnore
    private Editoriales editoriales;
}
