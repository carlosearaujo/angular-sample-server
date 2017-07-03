package br.com.mv.pacientes.controller;

import br.com.mv.pacientes.model.Paciente;
import br.com.mv.pacientes.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Carlos on 03/07/2017.
 */
@RestController
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @RequestMapping("/list")
    public List<Paciente> list(){
        return pacienteService.list();
    }

    @RequestMapping(method = RequestMethod.POST, value ="/pacientes")
    public void addTopic(@RequestBody Paciente paciente) {
        pacienteService.save(paciente);
    }
}
