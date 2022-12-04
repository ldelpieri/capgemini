package com.example.prueba.model.entities.tienda.medioDePago;

public class Transferencia extends MedioDePago {
    private static Transferencia instancia = null;
    private Transferencia() {};
    public static Transferencia getInstancia() {
        if(instancia == null) {
            instancia = new Transferencia();
        }
        return instancia;
    }
}
