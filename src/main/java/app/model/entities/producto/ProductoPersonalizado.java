package app.model.entities.producto;

import app.model.entities.EntidadPersistente;
import app.model.entities.producto.estado.Pausa;
import app.model.converter.EstadoConverter;
import app.model.entities.producto.estado.Estado;
import app.model.entities.producto.estado.Activo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Producto_personalizado")
@Getter @Setter
public class ProductoPersonalizado extends EntidadPersistente {
    @Column(name = "prod_pers_nombre")
    String nombre;
    @Column(name = "prod_pers_descripcion")
    String descripcion;
    @Column(name = "prod_pers_precio")
    Double precio;
    @Column(name = "prod_pers_estado")
    @Convert(converter = EstadoConverter.class)
    Estado estado;

    public void activar() {
        this.estado = Activo.getInstancia();
    }

    public void pausar() {
        this.estado = Pausa.getInstancia();
    }

    public ProductoPersonalizado vender() throws Exception {
        return estado.vender(this);
    }

}
