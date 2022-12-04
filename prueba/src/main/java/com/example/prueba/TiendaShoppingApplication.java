package com.example.prueba;

import com.example.prueba.model.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.prueba.repository.alumno.RepositorioAlumno;

@SpringBootApplication
public class TiendaShoppingApplication {

	@Autowired
	@Qualifier("RepositorioAlumnoMemoria")
	RepositorioAlumno alumnos;

	public static void main(String[] args) {
		SpringApplication.run(TiendaShoppingApplication.class, args);
	}

	@Bean // los @Bean sobre métodos que son CommandLineRunner se ejecutan al inicializar el programa
	public CommandLineRunner init() {
		return (args) -> {
			alumnos.addAlumno(new Alumno("Luca", "Delpieri"));
			alumnos.addAlumno(new Alumno("Rocío", "Lucconi"));
		};
	}
}
