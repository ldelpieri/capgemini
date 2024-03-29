package tiendaShopping.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoPersonalizadoPostDTO {
    private String nombre;
    private Integer productoPersonalizable;
    private String personalizacion;
    private String estado;
    private Integer tienda;
}
