package tiendaShopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiendaShopping.model.entities.producto.Personalizacion;
import tiendaShopping.repositories.PersonalizacionRepository;
import javax.validation.Valid;

@RestController
public class ControllerPersonalizacion {
    @Autowired
    PersonalizacionRepository repoPersonalizacion;

    @PostMapping("/personalizacion/agregar")
    public Personalizacion agregarPersonalizacion(@RequestBody @Valid Personalizacion personalizacion,  BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            return repoPersonalizacion.save(personalizacion);
        } else {
            throw new IllegalStateException("Alumno mal armado");
        }
    }
}
