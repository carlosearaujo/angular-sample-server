package br.com.mv.pacientes;

import br.com.mv.pacientes.service.PacienteService;
import br.com.mv.pacientes.service.PacienteServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class PacientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacientesApplication.class, args);
	}

	@Bean
	public PacienteService serviceInterface(){
		return new PacienteServiceImp();
	}
}
