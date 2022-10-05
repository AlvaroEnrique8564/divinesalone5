package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Cita;

@Repository
public interface CitaRepositorio extends JpaRepository<Cita, Long> {

}
