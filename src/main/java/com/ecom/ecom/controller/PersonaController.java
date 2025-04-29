package com.ecom.ecom.controller;

import org.springframework.bind.annotation.RequestMapping;

@RequestMapping("/api/persona")
@RequestController
public class PersonaController {

@GetMapping
public String saludar() {
    return "ola waooooooooooooo";
 }
 
}