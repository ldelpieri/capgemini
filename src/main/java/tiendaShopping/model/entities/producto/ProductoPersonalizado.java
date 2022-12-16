package tiendaShopping.model.entities.producto;

import tiendaShopping.model.entities.producto.estado.Pausa;
import tiendaShopping.converters.EstadoConverter;
import tiendaShopping.model.entities.producto.estado.Estado;
import tiendaShopping.model.entities.producto.estado.Activo;
import lombok.Getter;
import lombok.Setter;
import tiendaShopping.model.entities.tienda.Tienda;

import javax.persistence.*;

@Entity
@Table(name = "Producto_personalizado")
@Getter @Setter
public class ProductoPersonalizado {
    @Id @GeneratedValue @Column(name = "prod_pers_codigo")
    private Integer codigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prod_pers_producto_personalizable")
    private ProductoPersonalizable productoPersonalizable;

    @Column(name = "prod_pers_estado")
    @Convert(converter = EstadoConverter.class)
    Estado estado;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prod_pers_tienda")
    Tienda tienda;

    public ProductoPersonalizado(ProductoPersonalizable productoPersonalizable, Estado estado, Tienda tienda) {
        this.productoPersonalizable = productoPersonalizable;
        this.estado = estado;
        this.tienda = tienda;
    }

    public ProductoPersonalizado() {

    }

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
