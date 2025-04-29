package com.ecom.ecom.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@data
@NoArgsConstructor
@AllArgsConstructor


public class persona{
    private int id;
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
}