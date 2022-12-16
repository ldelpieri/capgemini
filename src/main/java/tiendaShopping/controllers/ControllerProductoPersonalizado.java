package tiendaShopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiendaShopping.DTO.ProductoPersonalizadoGetDTO;
import tiendaShopping.DTO.ProductoPersonalizadoPostDTO;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/productoPersonalizado")
public class ControllerProductoPersonalizado {
    @Autowired
    ProductoPersonalizadoRepository repoProductoPersonalizado;
    @Autowired
    ProductoPersonalizableRepository repoPersonalizable;
    @Autowired
    TiendaRepository repoTienda;

    @GetMapping(path = {"/"})
    public List<ProductoPersonalizadoGetDTO> productosPersonalizados(@RequestParam(value = "tienda") Integer tiendaId) {
        List<ProductoPersonalizado> productos = repoProductoPersonalizado.findByTienda(repoTienda.findById(tiendaId).get());
        List<ProductoPersonalizadoGetDTO> res = new ArrayList<>();
        for (ProductoPersonalizado producto : productos) {
            res.add(new ProductoPersonalizadoGetDTO(producto.getProductoPersonalizable(), producto.getEstado()));
        }
        return res;
    }

    @PostMapping(path = {"", "/"})
    public ProductoPersonalizado agregarProductoPersonalizado(@RequestBody @Valid ProductoPersonalizadoPostDTO producto, BindingResult bindingResult) {
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
