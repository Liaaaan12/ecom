package com.ecom.ecom.repository;

public class PersonaRepository {

    List<Persona> personas = new ArrayList<>();

    public Persona create(Persona persona)
    {
        personas.add(persona);
        return persona;
    }


}