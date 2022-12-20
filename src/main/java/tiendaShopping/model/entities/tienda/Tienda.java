package tiendaShopping.model.entities.tienda;

import tiendaShopping.model.entities.producto.ProductoPersonalizado;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Tienda")
@Getter @Setter
public class Tienda {
    @Id @GeneratedValue @Column(name = "tien_codigo")
    private Integer codigo;
    @Column(name = "tien_nombre")
    private String nombre;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "tien_vendedor")
    private Vendedor vendedor;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "tienda", cascade = CascadeType.ALL)
    private List<ProductoPersonalizado> productosPersonalizados;

    @ElementCollection(targetClass=MedioDePago.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "Medio_aceptado", joinColumns = @JoinColumn(name = "medi_acep_tienda"))
    @Column(name="medi_acep_medio_de_pago")
    private Set<MedioDePago> mediosDePago;


    public Tienda() {
        this.productosPersonalizados = new ArrayList<>();
        this.mediosDePago = new HashSet<>();
    }

    public void agregarProductoPersonalizado(ProductoPersonalizado productoPersonalizado) {
        productosPersonalizados.add(productoPersonalizado);
    }

    public void borrarProductoPersonalizado(ProductoPersonalizado producto) {
        productosPersonalizados.remove(producto);
    }

    public void agregarMedioDePago(String medioDePago) {
        this.mediosDePago.add(MedioDePago.valueOf(medioDePago));
    }
}
