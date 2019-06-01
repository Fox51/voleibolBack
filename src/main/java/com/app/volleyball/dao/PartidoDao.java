package com.app.volleyball.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.volleyball.entity.Partido;

@Repository
public interface PartidoDao extends JpaRepository<Partido, Long> {

}
