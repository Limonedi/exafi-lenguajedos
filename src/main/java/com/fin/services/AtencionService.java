package com.fin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fin.model.mAtencion;
import com.fin.repository.AtencionRepository;

@Service
public class AtencionService {

	@Autowired
    private AtencionRepository atencionRepository;
    
    public List<mAtencion> listarAtenciones() {
        return atencionRepository.findAll();
    }
    
    public mAtencion guardarAtencion(mAtencion atencion) {
        return atencionRepository.save(atencion);
    }
    
    public mAtencion obtenerAtencion(Long id) {
        return atencionRepository.findById(id).orElse(null);
    }
    
    public void eliminarAtencion(Long id) {
        atencionRepository.deleteById(id);
    }
}
