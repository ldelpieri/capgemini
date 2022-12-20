package tiendaShopping.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoDetalleTiendaGetDTO {
    private Integer codigo;
    private String nombre;
    private Double precio;
    private String personalizacion;
    private String descripcion;
    private Integer tiempoDeFabricacion;
    private String foto;

    public ProductoDetalleTiendaGetDTO(Integer codigo, String nombre, Double precio, String personalizacion, String descripcion, Integer tiempoDeFabricacion, String foto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.personalizacion = personalizacion;
        this.descripcion = descripcion;
        this.tiempoDeFabricacion = tiempoDeFabricacion;
        this.foto = foto;
    }
}
