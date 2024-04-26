package com.prueba.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "editoriales")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Editoriales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String Direccion;
    @OneToMany(targetEntity = Libros.class, mappedBy = "editoriales", fetch = FetchType.LAZY)
    private List<Libros> libros;

}
