package tiendaShopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import tiendaShopping.model.entities.producto.Personalizacion;
import tiendaShopping.repositories.PersonalizacionRepository;
import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/personalizacion")
public class ControllerPersonalizacion {
    @Autowired
    PersonalizacionRepository repoPersonalizacion;

    @GetMapping(path = {"", "/"})
    public List<Personalizacion> personalizaciones() {
        return repoPersonalizacion.findAll();
    }

    @GetMapping(path = "/{codigo}")
    public Personalizacion personalizacion(@PathVariable Integer codigo) {
        return repoPersonalizacion.findById(codigo).get();
    }

    @PostMapping(path = {"", "/"})
    public Personalizacion agregarPersonalizacion(@RequestBody @Valid Personalizacion personalizacion,  BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            return repoPersonalizacion.save(personalizacion);
        } else {
            throw new IllegalStateException("Alumno mal armado");
        }
    }

    @PutMapping(path = {"{codigo}"})
    public Personalizacion modificarPersonalizacion(@PathVariable Integer codigo, @RequestBody @Valid Personalizacion personalizacion) {
        Personalizacion pers = repoPersonalizacion.findById(codigo).get();
        pers.actualizar(personalizacion);
        return repoPersonalizacion.save(pers);
    }

    @DeleteMapping(path = "/{codigo}")
    public String borrarPersonalizacion(@PathVariable Integer codigo) {
        if(repoPersonalizacion.existsById(codigo)) {
            repoPersonalizacion.deleteById(codigo);
            return "Borrado correctamente";
        } else {
            return "La personalización no existe";
        }
    }


}
