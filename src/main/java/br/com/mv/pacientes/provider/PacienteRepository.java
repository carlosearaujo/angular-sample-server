package br.com.mv.pacientes.provider;

import br.com.mv.pacientes.model.Paciente;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Carlos on 03/07/2017.
 */

public interface PacienteRepository extends CrudRepository<Paciente, String> {}
