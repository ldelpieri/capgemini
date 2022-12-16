package tiendaShopping.model.entities.producto;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Producto_base")
@Getter @Setter
public class ProductoBase {
    @Id
    @GeneratedValue
    @Column(name = "prod_base_codigo")
    private Integer codigo;
    @Column(name = "prod_base_nombre")
    private String nombre;
    @Column(name = "prod_base_descripcion")
    private String descripcion;
    @Column(name = "prod_base_precio")
    private Double precioBase;
    @Column(name = "prod_base_tiempo")
    private Double tiempoDeFabricacion;
}
