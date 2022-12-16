package tiendaShopping.model.entities.producto;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "Personalizacion")
@Getter @Setter
public class Personalizacion {
    @Id
    @GeneratedValue
    @Column(name = "pers_codigo")
    private Integer codigo;
    @Column(name = "pers_nombre")
    private String nombre;
    @Column(name = "pers_precio")
    private Double precio;
}
