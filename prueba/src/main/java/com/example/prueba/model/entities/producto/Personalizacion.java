package com.example.prueba.model.entities.producto;

import com.example.prueba.model.entities.EntidadPersistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Personalizacion")
@Getter @Setter
public class Personalizacion extends EntidadPersistente {
    @Column(name = "pers_nombre")
    private String nombre;
    @Column(name = "pers_precio")
    private Double precio;
}
