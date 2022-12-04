package com.example.prueba.model.entities.tienda.medioDePago;


import com.example.prueba.model.entities.producto.estado.Activo;

public class Efectivo extends MedioDePago {
    private static Efectivo instancia = null;
    private Efectivo() {};
    public static Efectivo getInstancia() {
        if(instancia == null) {
            instancia = new Efectivo();
        }
        return instancia;
    }
}
