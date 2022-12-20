package tiendaShopping.DTO;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter @Setter
public class CompraDTO {
    String nombre;
    String apellido;
    String email;
    String medioDePago;
    List<ItemDTO> items;

}
