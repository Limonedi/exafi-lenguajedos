package com.fin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fin.model.mPaciente;

@Repository
public interface PacienteRepository extends JpaRepository<mPaciente, Long> {

}
