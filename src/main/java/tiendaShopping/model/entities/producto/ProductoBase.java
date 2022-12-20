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
    private Double precio;
    @Column(name = "prod_base_tiempo")
    private Integer tiempoDeFabricacion;
    @Column(name = "prod_base_foto")
    private String foto;

    public void actualizar(ProductoBase producto) {
        this.nombre = producto.getNombre();
        this.descripcion = producto.getDescripcion();
        this.precio = producto.getPrecio();
        this.tiempoDeFabricacion = producto.getTiempoDeFabricacion();
        this.foto = producto.getFoto();
    }
}
