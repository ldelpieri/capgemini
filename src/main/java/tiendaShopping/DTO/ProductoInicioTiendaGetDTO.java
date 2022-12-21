package tiendaShopping.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoInicioTiendaGetDTO {
    private Integer codigo;
    private String nombre;
    private String personalizacion;
    private Double precio;
    private String foto;

    public ProductoInicioTiendaGetDTO(Integer codigo, String nombre, String personalizacion, Double precio, String foto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.personalizacion = personalizacion;
        this.precio = precio;
        this.foto = foto;
    }
}
