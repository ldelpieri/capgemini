package app.repository.alumno;

import app.model.Alumno;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioAlumno {
    public void addAlumno(Alumno alumno);
    public Alumno findByApellido(String apellido);

    public List<Alumno> all();
}
