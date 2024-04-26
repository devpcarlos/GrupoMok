package com.prueba.controller;

import com.prueba.Dto.EscriturasDto;
import com.prueba.services.EscriturasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/escrituras")
public class EscriturasController {

    @Autowired
    EscriturasService escriturasService;

    @PostMapping("/save")
    public ResponseEntity<?> create(@RequestBody EscriturasDto escriturasDto){
       return escriturasService.createEscrituras(escriturasDto);

    }
    @GetMapping
    public ResponseEntity<?> List(){
        return escriturasService.ListAll();

    }
    @GetMapping("/{genero}")
    public ResponseEntity<?> ListGenero(@PathVariable String genero){
        return escriturasService.ListGenero(genero);

    }

}
