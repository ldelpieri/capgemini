package tiendaShopping.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoInicioTiendaGetDTO {
    private Integer codigo;
    private String nombre;
    private Double precio;
    private String foto;

    public ProductoInicioTiendaGetDTO(Integer codigo, String nombre, Double precio, String foto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
    }
}
