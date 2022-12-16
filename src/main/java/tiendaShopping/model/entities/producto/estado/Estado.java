package tiendaShopping.model.entities.producto.estado;


import tiendaShopping.model.entities.producto.ProductoPersonalizado;

public abstract class Estado {

    public abstract ProductoPersonalizado vender(ProductoPersonalizado producto) throws Exception;

    public abstract String nombre();
}
