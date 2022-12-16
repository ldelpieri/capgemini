package tiendaShopping.model.entities.producto.estado;

import tiendaShopping.model.entities.producto.ProductoPersonalizado;

public class Pausa extends Estado {
    private  static Pausa instancia = null;

    private Pausa() {};

    public static Pausa getInstancia() {
        if(instancia == null) {
            instancia = new Pausa();
        }
        return instancia;
    }
    @Override
    public ProductoPersonalizado vender(ProductoPersonalizado producto) throws Exception {
        throw new Exception("No se puede vender un producto en pausa");
    }
}
