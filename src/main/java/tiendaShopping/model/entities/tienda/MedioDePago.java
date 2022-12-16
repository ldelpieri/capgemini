package tiendaShopping.model.entities.tienda;

import javax.persistence.*;

@Entity
@Table(name = "Medio_de_pago")
public enum MedioDePago {
    EFECTIVO,
    TRANSFERENCIA,
    TARJETA_DE_CREDITO,
    TARJETA_DE_DEBITO;
    @Id
    @GeneratedValue
    @Column(name = "medi_pago_codigo")
    private Integer medi_pago_codigo;

}
