package tiendaShopping.model.entities.tienda;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "Vendedor")
public class Vendedor {
    @Id @GeneratedValue @Column(name = "vend_codigo")
    private Integer codigo;
    @Column(name = "vend_nombre")
    private String nombre;

    @OneToOne
    @JoinColumn(name = "vend_tienda")
    private Tienda tienda;

}
