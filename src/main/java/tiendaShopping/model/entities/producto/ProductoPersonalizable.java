package tiendaShopping.model.entities.producto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "Producto_personalizable")
public class ProductoPersonalizable {
    @Id @GeneratedValue
    @Column(name = "prod_pers_codigo")
    private Integer codigo;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "prod_pers_producto_base")
    private ProductoBase productoBase;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "prod_pers_personalizacion")
    private Personalizacion personalizacion;

    public ProductoPersonalizable(ProductoBase productoBase, Personalizacion personalizacion) {
        this.productoBase = productoBase;
        this.personalizacion = personalizacion;
    }

    public ProductoPersonalizable() {

    }

    public String getNombre() {
        return this.productoBase.getNombre();
    }

    public String getNombrePersonalizacion() {
        return this.personalizacion.getNombre();
    }

    public Double getPrecio() {
        return this.productoBase.getPrecio() + this.personalizacion.getPrecio();
    }

    public Integer getTiempoDeFabricacion() {
        return this.productoBase.getTiempoDeFabricacion();
    }

    public String getFoto() {
        return this.productoBase.getFoto();
    }
}
