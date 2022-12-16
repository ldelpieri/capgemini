package tiendaShopping.model.entities.producto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Getter @Setter
@Table(name = "Producto_personalizable")
public class ProductoPersonalizable {
    @Id @GeneratedValue
    @Column(name = "prod_pers_codigo")
    private Integer codigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prod_pers_producto_base")
    private ProductoBase productoBase;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prod_pers_personalizacion")
    private Personalizacion personalizacion;

    public ProductoPersonalizable(Optional<ProductoBase> productoBase, Optional<Personalizacion> personalizacion) {
    }

    public ProductoPersonalizable() {

    }
}
