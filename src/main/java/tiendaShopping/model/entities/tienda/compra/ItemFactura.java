package tiendaShopping.model.entities.tienda.compra;

import lombok.Getter;
import lombok.Setter;
import tiendaShopping.model.entities.producto.ProductoPersonalizado;
import javax.persistence.*;

@Entity
@Table(name = "Item_factura")
@Getter @Setter
public class ItemFactura {
    @Id
    @GeneratedValue
    @Column(name = "item_codigo")
    Integer codigo;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "item_factura")
    Factura factura;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "item_producto")
    ProductoPersonalizado productoPersonalizado;

    @Column(name = "item_cantidad")
    Integer cantidad;

    @Column(name = "item_precio")
    Double precio;

    public ItemFactura() {};

    public ItemFactura(ProductoPersonalizado productoPersonalizado, Integer cantidad, Double precio) {
        this.productoPersonalizado = productoPersonalizado;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return this.productoPersonalizado.getNombre();
    }

    public String getTiempoDeFabricacion() {
        Integer tiempo = this.productoPersonalizado.getTiempoDeFabricacion();
        String dia;
        if(tiempo > 1) {
            dia = " días";
        } else {
            dia = " día";
        }
        return tiempo + dia;
    }
}
