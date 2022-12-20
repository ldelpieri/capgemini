package tiendaShopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/productoPersonalizable")
public class ControllerProductoPersonalizable {

    @Autowired
    ProductoPersonalizableRepository repoPersonalizable;
    @Autowired
    ProductoBaseRepository repoProductoBase;
    @Autowired
    PersonalizacionRepository repoPersonalizacion;

    @GetMapping(path = {"","/"})
    public List<ProductoPersonalizable> productosPersonalizables() {
        return repoPersonalizable.findAll();
    }

    @GetMapping(path = "/{codigo}")
    public ProductoPersonalizable productosPersonalizable(@PathVariable Integer codigo) {
        return repoPersonalizable.findById(codigo).get();
    }

    @PostMapping(path = {"","/"})
    public ProductoPersonalizable agregarProductoPersonalizable(@RequestBody @Valid ProductoPersonalizableDTO producto, BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            Optional<ProductoBase> productoBase = repoProductoBase.findById(producto.getProductoBase());
            Optional<Personalizacion> personalizacion = repoPersonalizacion.findById(producto.getPersonalizacion());
            ProductoPersonalizable nuevo = new ProductoPersonalizable(productoBase.get(), personalizacion.get());
            return repoPersonalizable.save(nuevo);
        } else {
            throw new IllegalStateException("Producto personalizable mal armado");
        }
    }

    @DeleteMapping(path = "/{codigo}")
    public String borrarProductoPersonalizable(@PathVariable Integer codigo) {
        if(repoPersonalizable.existsById(codigo)) {
            repoPersonalizable.deleteById(codigo);
            return "Borrado correctamente";
        } else {
            return "La personalización no existe";
        }
    }
}
