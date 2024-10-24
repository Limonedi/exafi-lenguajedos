package com.fin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fin.model.mAtencion;
import com.fin.services.AtencionService;
import com.fin.services.PacienteService;

@Controller
@RequestMapping("/atenciones")
public class AtencionController {
    
    @Autowired
    private AtencionService ateService;
    
    @Autowired
    private PacienteService pacService;
    
    @GetMapping
    public String listarAtenciones(Model model) {
        model.addAttribute("atenciones", ateService.listarAtenciones());
        return "atenciones/listaAtenciones";
    }
    
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("atencion", new mAtencion());
        model.addAttribute("pacientes", pacService.listarPacientes());
        return "atenciones/crear";
    }
    
    @PostMapping("/guardar")
    public String guardarAtencion(@ModelAttribute mAtencion atencion) {
        ateService.guardarAtencion(atencion);
        return "redirect:/atenciones";
    }
    
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        mAtencion atencion = ateService.obtenerAtencion(id);
        model.addAttribute("atencion", atencion);
        model.addAttribute("pacientes", pacService.listarPacientes());
        return "atenciones/editar";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarAtencion(@PathVariable Long id) {
        ateService.eliminarAtencion(id);
        return "redirect:/atenciones";
    }
}
