package com.example.prueba.model.entities.producto;

import com.example.prueba.model.entities.EntidadPersistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Producto_base")
@Getter @Setter
public class ProductoBase extends EntidadPersistente {
    @Column(name = "prod_base_nombre")
    private String nombre;
    @Column(name = "prod_base_descripcion")
    private String descripcion;
    @Column(name = "prod_base_precio")
    private Double precioBase;
    @Column(name = "prod_base_tiempo")
    private Double tiempoDeFabricacion;
}
