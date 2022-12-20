package tiendaShopping.model.entities.producto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import tiendaShopping.converters.EstadoConverter;
import tiendaShopping.model.entities.producto.estado.Estado;
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
    @ManyToOne
    @JoinColumn(name = "prod_pers_producto_personalizable")
    private ProductoPersonalizable productoPersonalizable;
    @Column(name = "prod_pers_personalizacion")
    private String personalizacion;
    @JsonIgnore
    @Column(name = "prod_pers_estado")
    @Convert(converter = EstadoConverter.class)
    Estado estado;
    @ManyToOne
    @JoinColumn(name = "prod_pers_tienda")
    Tienda tienda;

    public ProductoPersonalizado(ProductoPersonalizable productoPersonalizable, String personalizacion, String estado, Tienda tienda) {
        EstadoConverter converter = new EstadoConverter();
        this.productoPersonalizable = productoPersonalizable;
        this.personalizacion = personalizacion;
        this.estado = converter.convertToEntityAttribute(estado);
        this.tienda = tienda;
        tienda.agregarProductoPersonalizado(this);
    }

    public ProductoPersonalizado() {

    }

    public ProductoPersonalizado vender() throws Exception {
        return estado.vender(this);
    }

    public void actualizar(String personalizacion, String estadoNuevo) {
        EstadoConverter converter = new EstadoConverter();
        this.personalizacion = personalizacion;
        this.estado = converter.convertToEntityAttribute(estadoNuevo);
    }

    public String getNombre() {
        return this.productoPersonalizable.getNombre();
    }

    public Double getPrecio() {
        return this.productoPersonalizable.getPrecio();
    }

    public boolean sePuedeListar() {
        return estado.sePuedeListar();
    }

    public String getDescripcion() {
        return productoPersonalizable.getProductoBase().getDescripcion();
    }

    public Integer getTiempoDeFabricacion() {
        return productoPersonalizable.getTiempoDeFabricacion();
    }

    public String getFoto() {
        return productoPersonalizable.getFoto();
    }
}
