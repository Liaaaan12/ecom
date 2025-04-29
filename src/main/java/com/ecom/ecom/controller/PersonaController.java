package com.ecom.ecom.controller;

import org.springframework.bind.annotation.RequestMapping;

@RequestMapping("/api/persona")
@RequestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;

@GetMapping
public String saludar() {
    return "ola waooooooooooooo";
 }

@PostMapping
public Persona CrearPersona(@RequestBody Persona persona) {
    return personaService.Guardar(persona);
 }
}