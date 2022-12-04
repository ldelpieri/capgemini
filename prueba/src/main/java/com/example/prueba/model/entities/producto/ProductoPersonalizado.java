package com.example.prueba.model.entities.producto;

import com.example.prueba.model.converter.EstadoConverter;
import com.example.prueba.model.entities.EntidadPersistente;
import com.example.prueba.model.entities.producto.estado.Activo;
import com.example.prueba.model.entities.producto.estado.Estado;
import com.example.prueba.model.entities.producto.estado.Pausa;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Producto_personalizado")
@Getter @Setter
public class ProductoPersonalizado extends EntidadPersistente {
    @Column(name = "prod_pers_nombre")
    String nombre;
    @Column(name = "prod_pers_descripcion")
    String descripcion;
    @Column(name = "prod_pers_precio")
    Double precio;
    @Column(name = "prod_pers_estado")
    @Convert(converter = EstadoConverter.class)
    Estado estado;

    public void activar() {
        this.estado = Activo.getInstancia();
    }

    public void pausar() {
        this.estado = Pausa.getInstancia();
    }

    public ProductoPersonalizado vender() throws Exception {
        return estado.vender(this);
    }

}
