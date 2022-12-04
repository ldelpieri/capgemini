package com.example.prueba.model;

import lombok.Getter;

public class Alumno {
    private String nombre;
    @Getter
    private String apellido;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
