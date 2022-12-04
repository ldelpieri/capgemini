package app.repository.alumno;

import app.model.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // une los pedidos HTTP con el código
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    @Qualifier("RepositorioAlumnoMemoria")
    RepositorioAlumno repo;

    @RequestMapping(path = {"", "/"})
    List<Alumno> alumnos() {
        return repo.all();
    }
}
