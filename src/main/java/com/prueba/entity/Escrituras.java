package com.prueba.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "escrituras")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Escrituras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String genero;
    private LocalDateTime created;

      @OneToMany(targetEntity = Autores.class, fetch =FetchType.LAZY ,mappedBy = "escrituras")
    private List<Autores> autores;

    @OneToMany(targetEntity = Libros.class , fetch =FetchType.LAZY , mappedBy = "escrituras")
    private List <Libros> libros;
}
