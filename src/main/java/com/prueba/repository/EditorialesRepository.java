package com.prueba.repository;

import com.prueba.entity.Autores;
import com.prueba.entity.Editoriales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditorialesRepository extends JpaRepository<Editoriales, Long> {
}
