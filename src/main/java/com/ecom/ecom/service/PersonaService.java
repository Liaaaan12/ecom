package com.ecom.ecom.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ecom.ecom.model.Persona;

@Service
public class PersonaService {
    @AutoWired
    private PersonaRepository personaRepository;

    public Persona Guardar (Persona persona) {
        return personaRepository.create(persona);
    }

    @PostMapping("path")
    public String PostMethodName(@RequestBody String entity) {
        // TODO: process post request
        return entity;
    }
}
   