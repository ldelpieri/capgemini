package tiendaShopping.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoPersonalizadoPostDTO {
    Integer codigo;
    Integer productoPersonalizable;
    Integer estado;
    Integer tienda;
}
