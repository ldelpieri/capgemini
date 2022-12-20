package tiendaShopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiendaShopping.DTO.ProductoPersonalizadoGetDTO;
import tiendaShopping.DTO.ProductoPersonalizadoPostDTO;
import tiendaShopping.DTO.ProductoPersonalizadoPutDTO;
import tiendaShopping.model.entities.producto.ProductoPersonalizable;
import tiendaShopping.model.entities.producto.ProductoPersonalizado;
import tiendaShopping.model.entities.tienda.Tienda;
import tiendaShopping.repositories.ProductoPersonalizableRepository;
import tiendaShopping.repositories.ProductoPersonalizadoRepository;
import tiendaShopping.repositories.TiendaRepository;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/productoPersonalizado")
public class ControllerProductoPersonalizado {
    @Autowired
    ProductoPersonalizadoRepository repoProductoPersonalizado;
    @Autowired
    ProductoPersonalizableRepository repoProductoPersonalizable;
    @Autowired
    TiendaRepository repoTienda;

    @GetMapping(path = {"/"})
    public List<ProductoPersonalizadoGetDTO> productosPersonalizados(@RequestParam(value = "tienda") Integer tiendaId) {
        List<ProductoPersonalizado> productos = repoProductoPersonalizado.findByTienda(repoTienda.findById(tiendaId).get());
        List<ProductoPersonalizadoGetDTO> res = new ArrayList<>();
        for (ProductoPersonalizado producto : productos) {
            res.add(new ProductoPersonalizadoGetDTO(producto.getCodigo(), producto.getProductoPersonalizable(),producto.getPersonalizacion(), producto.getEstado()));
        }
        return res;
    }

    @GetMapping(path = "/{codigo}")
    public ProductoPersonalizadoGetDTO productosPersonalizado(@PathVariable Integer codigo) {
        ProductoPersonalizado producto = repoProductoPersonalizado.findById(codigo).get();
        return new ProductoPersonalizadoGetDTO(producto.getCodigo(), producto.getProductoPersonalizable(), producto.getPersonalizacion(), producto.getEstado());
    }

    @PostMapping(path = {"", "/"})
    public ProductoPersonalizadoGetDTO agregarProductoPersonalizado(@RequestBody @Valid ProductoPersonalizadoPostDTO producto, BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            ProductoPersonalizable productoPersonalizable = repoProductoPersonalizable.findById(producto.getProductoPersonalizable()).get();
            Tienda tienda = repoTienda.findById(producto.getTienda()).get();
            ProductoPersonalizado productoNuevo = new ProductoPersonalizado(productoPersonalizable, producto.getPersonalizacion(), producto.getEstado(), tienda);
            tienda.agregarProductoPersonalizado(productoNuevo);
            repoTienda.save(tienda);
            productoNuevo.setCodigo(tienda.getProductosPersonalizados().get(tienda.getProductosPersonalizados().size()-1).getCodigo());
            return new ProductoPersonalizadoGetDTO(productoNuevo.getCodigo(), productoNuevo.getProductoPersonalizable(), productoNuevo.getPersonalizacion(), productoNuevo.getEstado());
        } else {
            throw new IllegalStateException("Producto personalizado mal armado");
        }
    }

    @PutMapping(path = {"/{codigo}"})
    public ProductoPersonalizadoGetDTO actualizarProductoPersonalizado(@PathVariable Integer codigo, @RequestBody @Valid ProductoPersonalizadoPutDTO producto) {
        if(repoProductoPersonalizado.existsById(codigo)) {
            ProductoPersonalizado productoPersonalizado = repoProductoPersonalizado.findById(codigo).get();
            productoPersonalizado.actualizar(producto.getPersonalizacion(), producto.getEstado());
            repoProductoPersonalizado.save(productoPersonalizado);
            return new ProductoPersonalizadoGetDTO(productoPersonalizado.getCodigo(), productoPersonalizado.getProductoPersonalizable(), productoPersonalizado.getPersonalizacion(),productoPersonalizado.getEstado());
        } else {
            throw new IllegalStateException("Producto no encontrado");
        }

    }

    @DeleteMapping(path = "/{codigo}")
    public String borrarProductoPersonalizado(@PathVariable Integer codigo) {
        if(repoProductoPersonalizado.existsById(codigo)) {
            ProductoPersonalizado producto = repoProductoPersonalizado.findById(codigo).get();
            producto.getTienda().borrarProductoPersonalizado(producto);
            repoTienda.save(producto.getTienda());
            repoProductoPersonalizado.deleteById(codigo);
            return "Borrado correctamente";
        } else {
            return "El producto personalizado no existe";
        }
    }
}
