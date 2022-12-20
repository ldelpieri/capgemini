package tiendaShopping.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NombreTiendaDTO {
    String nombre;

    public NombreTiendaDTO(String nombre) {
        this.nombre = nombre;
    }
}
