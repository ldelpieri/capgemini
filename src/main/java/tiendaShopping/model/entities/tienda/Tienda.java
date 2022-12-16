package tiendaShopping.model.entities.tienda;

import tiendaShopping.converters.MedioDePagoConverter;
import tiendaShopping.model.entities.producto.ProductoPersonalizado;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Tienda")
@Getter @Setter
public class Tienda {
    @Id @GeneratedValue @Column(name = "tien_codigo")
    private Integer codigo;
    @Column(name = "tien_nombre")
    private String nombre;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tien_vendedor")
    private Vendedor vendedor;

    @OneToMany(mappedBy = "tienda", fetch = FetchType.LAZY)
    private List<ProductoPersonalizado> productos;

    @Convert(converter = MedioDePagoConverter.class)
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Medio_aceptado",
            joinColumns = @JoinColumn(name = "Medi_acep_tienda"),
            inverseJoinColumns = @JoinColumn(name = "medi_acep_medio_de_pago"))
    private List<MedioDePago> mediosDePago;


}
