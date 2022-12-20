package tiendaShopping.DTO;

import lombok.Getter;
import lombok.Setter;
import tiendaShopping.model.entities.producto.ProductoPersonalizable;
import tiendaShopping.model.entities.producto.estado.Estado;

@Getter @Setter
public class ProductoPersonalizadoGetDTO {
    private Integer codigo;
    private ProductoPersonalizable productoPersonalizable;
    private String personalizacion;
    private String estado;

    public ProductoPersonalizadoGetDTO(Integer codigo, ProductoPersonalizable productoPersonalizable, String personalizacion,Estado estado) {
        this.codigo = codigo;
        this.productoPersonalizable = productoPersonalizable;
        this.personalizacion = personalizacion;
        this.estado = estado.nombre();
    }
}
