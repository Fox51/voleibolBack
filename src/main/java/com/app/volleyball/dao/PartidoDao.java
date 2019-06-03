package com.app.volleyball.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.volleyball.entity.Partido;

@Repository
public interface PartidoDao extends JpaRepository<Partido, Long> {

	@Query("Select p FROM Partido p WHERE p.jugando=1")
	public Partido getActual();

}
