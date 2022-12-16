package tiendaShopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiendaShopping.DTO.ProductoPersonalizadoDTO;
import tiendaShopping.model.entities.producto.ProductoPersonalizable;
import tiendaShopping.model.entities.producto.ProductoPersonalizado;
import tiendaShopping.model.entities.producto.estado.Activo;
import tiendaShopping.model.entities.producto.estado.Estado;
import tiendaShopping.model.entities.producto.estado.Pausa;
import tiendaShopping.model.entities.tienda.Tienda;
import tiendaShopping.repositories.ProductoPersonalizableRepository;
import tiendaShopping.repositories.ProductoPersonalizadoRepository;
import tiendaShopping.repositories.TiendaRepository;

import javax.validation.Valid;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/productoPersonalizado")
public class ControllerProductoPersonalizado {
    @Autowired
    ProductoPersonalizadoRepository repoProductoPersonalizado;

    @Autowired
    ProductoPersonalizableRepository repoPersonalizable;

    @Autowired
    TiendaRepository repoTienda;

    @GetMapping(path = {"/"})
    public List<ProductoPersonalizado> productosPersonalizados(@RequestParam(value = "tienda") Integer tiendaId) {
        return repoProductoPersonalizado.findProductoPersonalizadoByTienda(repoTienda.findById(tiendaId).get());
    }

    @PostMapping(path = {"", "/"})
    public ProductoPersonalizado agregarProductoPersonalizado(@RequestBody @Valid ProductoPersonalizadoDTO producto, BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            Optional<ProductoPersonalizable> productoPersonalizable = repoPersonalizable.findById(producto.getProductoPersonalizable());
            Estado estado = producto.getEstado() == 1 ? Activo.getInstancia() : Pausa.getInstancia();
            Optional<Tienda> tienda = repoTienda.findById(producto.getTienda());
            ProductoPersonalizado productoNuevo = new ProductoPersonalizado(productoPersonalizable.get(), estado, tienda.get());
            return repoProductoPersonalizado.save(productoNuevo);
        } else {
            throw new IllegalStateException("Producto personalizado mal armado");
        }
    }
}
