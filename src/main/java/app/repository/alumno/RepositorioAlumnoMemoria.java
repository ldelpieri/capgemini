package app.repository.alumno;

import app.model.Alumno;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Qualifier("RepositorioAlumnoMemoria")
public class RepositorioAlumnoMemoria implements RepositorioAlumno {
    private List<Alumno> alumnos;

    public RepositorioAlumnoMemoria() {
        this.alumnos = new ArrayList<Alumno>();
    }

    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public Alumno findByApellido(String apellido) {
        return alumnos.stream().filter(alumno -> alumno.getApellido() == apellido).findFirst().get();
    }

    public List<Alumno> all() {
        return alumnos;
    }
}
