package br.com.mv.pacientes.service;

import br.com.mv.pacientes.model.Paciente;
import br.com.mv.pacientes.provider.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carlos on 03/07/2017.
 */
public class PacienteServiceImp implements PacienteService {

    @Autowired
    private PacienteRepository repository;

    @Override
    public List<Paciente> list() {
        List<Paciente> pacientes = new ArrayList<>();
        repository.findAll().forEach(pacientes::add);
        return pacientes;
    }

    @Override
    public void save(Paciente p) {
        repository.save(p);
    }
}
