package com.fin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fin.model.mPaciente;
import com.fin.services.PacienteService;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {
    
    @Autowired
    private PacienteService pacienteService;
    
    @GetMapping
    public String listarPacientes(Model model) {
        model.addAttribute("pacientes", pacienteService.listarPacientes());
        return "pacientes/listaPacientes";
    }
    
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("paciente", new mPaciente());
        return "pacientes/crear";
    }
    
    @PostMapping("/guardar")
    public String guardarPaciente(@ModelAttribute mPaciente paciente) {
        pacienteService.guardarPaciente(paciente);
        return "redirect:/pacientes";
    }
    
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        mPaciente paciente = pacienteService.obtenerPaciente(id);
        model.addAttribute("paciente", paciente);
        return "pacientes/editar";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarPaciente(@PathVariable Long id) {
        pacienteService.eliminarPaciente(id);
        return "redirect:/pacientes";
    }
}
