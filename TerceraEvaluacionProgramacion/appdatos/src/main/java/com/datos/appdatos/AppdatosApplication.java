package com.datos.appdatos;

import com.datos.appdatos.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppdatosApplication implements CommandLineRunner {
	@Autowired
	EmpleadoRepository empleadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppdatosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Empleado emp1 = new Empleado();
		emp1.setEdad();
		emp1.setApellidos("garcia");

		empleadoRepository.save(emp1)
	}
}
