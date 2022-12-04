package app.model.entities.tienda;

import app.model.entities.EntidadPersistente;
import app.model.entities.producto.ProductoPersonalizado;
import app.model.entities.tienda.medioDePago.MedioDePago;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "Vendedor")
public class Vendedor extends EntidadPersistente {
    @Column(name = "tien_nombre")
    private String nombre;
    @OneToOne(fetch = FetchType.LAZY)
    private Tienda tienda;

    public void agregarMedioDePago(MedioDePago medioDePago) {
        tienda.agregarMedioDePago(medioDePago);
    }

    public void quitarMedioDePago(MedioDePago medioDePago) throws Exception {
        tienda.quitarMedioDePago(medioDePago);
    }

    public void agregarProducto(ProductoPersonalizado producto) {
        tienda.agregarProducto(producto);
    }
}
