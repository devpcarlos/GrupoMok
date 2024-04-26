package com.prueba.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "autores")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Autores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String celular;
    private String nacionalidad;
    @ManyToOne(targetEntity = Escrituras.class)
    @JoinColumn(name = "Id_escrituras")
    @JsonIgnore
    private Escrituras escrituras;

}
