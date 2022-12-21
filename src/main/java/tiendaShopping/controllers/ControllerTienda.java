package tiendaShopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tiendaShopping.DTO.*;
import tiendaShopping.model.entities.producto.ProductoPersonalizado;
import tiendaShopping.model.entities.tienda.MedioDePago;
import tiendaShopping.model.entities.tienda.Tienda;
import tiendaShopping.model.entities.tienda.compra.EmailService;
import tiendaShopping.model.entities.tienda.compra.Factura;
import tiendaShopping.model.entities.tienda.compra.ItemFactura;
import tiendaShopping.repositories.FacturaRepository;
import tiendaShopping.repositories.ItemFacturaRepository;
import tiendaShopping.repositories.ProductoPersonalizadoRepository;
import tiendaShopping.repositories.TiendaRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/tienda")
public class ControllerTienda {

    @Autowired
    TiendaRepository repoTienda;
    @Autowired
    FacturaRepository repoFactura;
    @Autowired
    ItemFacturaRepository repoItem;
    @Autowired
    ProductoPersonalizadoRepository repoProductoPersonalizado;

    @GetMapping(path = "/{tiendaCodigo}/nombre")
    public NombreTiendaDTO nombreTienda(@PathVariable Integer tiendaCodigo) {
        return new NombreTiendaDTO(repoTienda.findById(tiendaCodigo).get().getNombre());
    }

    @GetMapping(path = "/{tiendaCodigo}/producto")
    public List<ProductoInicioTiendaGetDTO>  productos(@PathVariable Integer tiendaCodigo) {
        Tienda tienda = repoTienda.findById(tiendaCodigo).get();
        List<ProductoInicioTiendaGetDTO> productos = new ArrayList<>();
        for (ProductoPersonalizado producto : tienda.getProductosPersonalizados()) {
            if (producto.sePuedeListar()) {
                productos.add(new ProductoInicioTiendaGetDTO(producto.getCodigo(), producto.getNombre(), producto.getPersonalizacion(), producto.getPrecio(), producto.getFoto()));
            }
        }
        if(productos.size() > 0) {
            return productos;
        } else {
            throw new IllegalStateException("No hay productos para mostrar");
        }
    }

    @GetMapping(path = "/{tiendaCodigo}/{productoCodigo}")
    public ProductoDetalleTiendaGetDTO producto(@PathVariable Integer tiendaCodigo, @PathVariable Integer productoCodigo) {
        Tienda tienda = repoTienda.findById(tiendaCodigo).get();
        ProductoPersonalizado producto = tienda.getProductosPersonalizados().stream().filter(prod -> prod.getCodigo() == productoCodigo).findFirst().get();
        if (producto != null) {
            return new ProductoDetalleTiendaGetDTO(producto.getCodigo(), producto.getNombre(), producto.getPrecio(), producto.getNombrePersonalizacion() , producto.getPersonalizacion(), producto.getDescripcion(), producto.getTiempoDeFabricacion(), producto.getFoto());
        } else {
            throw new IllegalStateException("No se encontró el producto");
        }
    }

    @GetMapping(path = "/{tiendaCodigo}/medioDePago")
    public Set<MedioDePago> mediosDePago(@PathVariable Integer tiendaCodigo) {
        Tienda tienda = repoTienda.findById(tiendaCodigo).get();
        if (!tienda.getMediosDePago().isEmpty()) {
            return tienda.getMediosDePago();
        } else {
            throw new IllegalStateException("No hay medios de pago disponibles");
        }
    }

    @PostMapping(path = "/{tiendaCodigo}/medioDePago")
    public MedioDePagoDTO agregarMedioDePago(@PathVariable Integer tiendaCodigo, @RequestBody MedioDePagoDTO medioDePago) {
        Tienda tienda = repoTienda.findById(tiendaCodigo).get();
        tienda.agregarMedioDePago(medioDePago.getMedioDePago());
        repoTienda.save(tienda);
        return medioDePago;
    }

    @PostMapping(path = "/{tiendaCodigo}/compra")
    public Integer concretarCompra(@PathVariable Integer tiendaCodigo, @RequestBody CompraDTO compra) {
        List<ItemDTO> itemsDTO = compra.getItems();
        List<ItemFactura> items = new ArrayList<>();
        Double total = 0.0;
        for (ItemDTO item : itemsDTO) {
            ProductoPersonalizado producto = repoProductoPersonalizado.findById(item.getCodigo()).get();
            items.add(new ItemFactura(producto, item.getCantidad(), producto.getPrecio()));
            total += producto.getPrecio() * item.getCantidad();
        }

        Factura factura = new Factura(repoTienda.findById(tiendaCodigo).get(), compra.getNombre(), compra.getApellido(), compra.getEmail(), compra.getMedioDePago(), total);
        factura = repoFactura.save(factura);

        Factura finalFactura = factura;
        items.stream().forEach(item -> item.setFactura(finalFactura));

        items = repoItem.saveAll(items);

        EmailService.enviarComprobante(factura, items);

        return factura.getCodigo();
    }
}








