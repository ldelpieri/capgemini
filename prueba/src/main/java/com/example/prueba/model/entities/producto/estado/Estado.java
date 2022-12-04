package com.example.prueba.model.entities.producto.estado;


import com.example.prueba.model.entities.producto.ProductoPersonalizado;

public abstract class Estado {

    public abstract ProductoPersonalizado vender(ProductoPersonalizado producto) throws Exception;
}
