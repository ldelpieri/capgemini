package tiendaShopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiendaShopping.model.entities.producto.Personalizacion;
import tiendaShopping.model.entities.producto.ProductoBase;
import tiendaShopping.model.entities.producto.ProductoPersonalizable;
import tiendaShopping.repositories.PersonalizacionRepository;
import tiendaShopping.repositories.ProductoBaseRepository;
import tiendaShopping.repositories.ProductoPersonalizableRepository;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

import tiendaShopping.DTO.ProductoPersonalizableDTO;

@Controller
@RequestMapping(path = "/productoPersonalizable")
public class ControllerProductoPersonalizable {

    @Autowired
    ProductoPersonalizableRepository repoPersonalizable;
    @Autowired
    ProductoBaseRepository repoProductoBase;

    @Autowired
    PersonalizacionRepository repoPersonalizacion;

    @GetMapping(path = {"/"})
    public List<ProductoPersonalizable> productosPersonalizables() {
        return repoPersonalizable.findAll();
    }

    @PostMapping(path = {"/"})
    public ProductoPersonalizable agregarProductoPersonalizable(@RequestBody @Valid ProductoPersonalizableDTO producto, BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            Optional<ProductoBase> productoBase = repoProductoBase.findById(producto.getProductoBase());
            Optional<Personalizacion> personalizacion = repoPersonalizacion.findById(producto.getPersonalizacion());
            ProductoPersonalizable nuevo = new ProductoPersonalizable(productoBase, personalizacion);
            return repoPersonalizable.save(nuevo);
        } else {
            throw new IllegalStateException("Producto personalizable mal armado");
        }
    }
}
