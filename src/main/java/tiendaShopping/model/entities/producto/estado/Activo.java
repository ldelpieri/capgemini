package tiendaShopping.model.entities.producto.estado;

import tiendaShopping.model.entities.producto.ProductoPersonalizado;

public class Activo extends Estado {
    private static Activo instancia = null;

    private Activo() {};

    public static Activo getInstancia() {
        if(instancia == null) {
            instancia = new Activo();
        }
        return instancia;
    }

    @Override
    public ProductoPersonalizado vender(ProductoPersonalizado producto) {
       return producto;
    }
}