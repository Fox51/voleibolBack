package com.app.volleyball.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.volleyball.entity.Equipo;

@Repository
public interface EquipoDao extends JpaRepository<Equipo, Long> {

}
