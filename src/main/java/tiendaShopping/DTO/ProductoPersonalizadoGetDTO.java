package tiendaShopping.DTO;

import lombok.Getter;
import lombok.Setter;
import tiendaShopping.model.entities.producto.ProductoPersonalizable;
import tiendaShopping.model.entities.producto.estado.Activo;
import tiendaShopping.model.entities.producto.estado.Estado;

@Getter @Setter
public class ProductoPersonalizadoGetDTO {
    private ProductoPersonalizable productoPersonalizable;
    private String estado;

    public ProductoPersonalizadoGetDTO(ProductoPersonalizable productoPersonalizable, Estado estado) {
        this.productoPersonalizable = productoPersonalizable;
        this.estado = estado.nombre();
    }
}
