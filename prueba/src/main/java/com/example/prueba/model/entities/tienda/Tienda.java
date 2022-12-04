package com.example.prueba.model.entities.tienda;

import com.example.prueba.model.entities.EntidadPersistente;
import com.example.prueba.model.entities.producto.ProductoPersonalizado;
import com.example.prueba.model.entities.tienda.medioDePago.MedioDePago;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Tienda")
@Getter @Setter
public class Tienda extends EntidadPersistente {
    @Column(name = "tien_nombre")
    private String nombre;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "tien_codigo", referencedColumnName = "prod_pers_codigo")
    private List<ProductoPersonalizado> productos;
    @ElementCollection
    @CollectionTable(name = "Medio_acepado", joinColumns = @JoinColumn(name = "tien_codigo"))
    @Column(name = "medi_acep_medio")
    @Convert(converter = MedioDePago.class)
    private List<MedioDePago> mediosDePago;

    public void agregarMedioDePago(MedioDePago medioDePago) {
        this.mediosDePago.add(medioDePago);
    }

    public void quitarMedioDePago(MedioDePago medioDePago) throws Exception {
        mediosDePago.remove(medioDePago);
        //todo agregar exepcion si el epago no existe
    }

    public void agregarProducto(ProductoPersonalizado producto) {
        this.productos.add(producto);
    }

    public void eliminarProducto(ProductoPersonalizado producto) {
        productos.remove(producto);
        //todo agregar exepcion si el producto no existe
    }

    public void finalizarCompra(List<ProductoPersonalizado> productos, MedioDePago medioDePago) {

    }
}
