package app.model.entities.producto.estado;


import app.model.entities.producto.ProductoPersonalizado;

public abstract class Estado {

    public abstract ProductoPersonalizado vender(ProductoPersonalizado producto) throws Exception;
}
