package br.com.mv.pacientes.service;

import br.com.mv.pacientes.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Carlos on 03/07/2017.
 */
@Service
public interface PacienteService {
    List<Paciente> list();
    void save(Paciente p);
}
