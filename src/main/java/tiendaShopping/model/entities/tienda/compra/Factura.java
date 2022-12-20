package tiendaShopping.model.entities.tienda.compra;

import lombok.Getter;
import lombok.Setter;
import tiendaShopping.model.entities.tienda.MedioDePago;
import tiendaShopping.model.entities.tienda.Tienda;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Factura")
@Getter @Setter
public class Factura {
    @Id @GeneratedValue @Column(name = "fact_codigo")
    Integer codigo;

    @Column(name = "fact_fecha")
    LocalDateTime fecha;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "fact_tienda")
    Tienda tienda;

    @Column(name = "fact_nombre")
    String nombre;

    @Column(name = "fact_apellido")
    String apellido;

    @Column(name = "fact_email")
    String email;

    @Column(name = "fact_medio_de_pago")
    String medioDePago;

    @Column(name = "fact_total")
    Double total;

    public Factura(Tienda tienda, String nombre, String apellido, String email, String medioDePago, Double total) {
        this.fecha = LocalDateTime.now();
        this.tienda = tienda;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.medioDePago = medioDePago;
        this.total = total;
    }

    public Factura() {}
}
