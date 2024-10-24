package com.fin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fin.repository.PacienteRepository;
import com.fin.model.mPaciente;

@Service
public class PacienteService {

	@Autowired
    private PacienteRepository pacRepository;

    public List<mPaciente> listarPacientes() {
        return pacRepository.findAll();
    }

    public mPaciente guardarPaciente(mPaciente paciente) {
        return pacRepository.save(paciente);
    }
    public mPaciente obtenerPaciente(Long id) {
        return pacRepository.findById(id).orElse(null);
    }
    
    public void eliminarPaciente(Long id) {
        pacRepository.deleteById(id);
    }
}
