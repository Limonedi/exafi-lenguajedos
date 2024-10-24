package com.fin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fin.model.mAtencion;

@Repository
public interface AtencionRepository extends JpaRepository<mAtencion, Long> {

}
