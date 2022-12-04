package com.example.prueba.model.entities;

import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EntidadPersistente {
    @Id
    @GeneratedValue
    @Getter
    private Integer codigo;
}
