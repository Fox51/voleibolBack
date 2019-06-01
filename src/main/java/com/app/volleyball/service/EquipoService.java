package com.app.volleyball.service;

import java.util.List;
import java.util.Optional;

import com.app.volleyball.entity.Equipo;

public interface EquipoService {
	
	Equipo crearEquipo(Equipo equipo);
	
	Equipo actualizarEquipo(Equipo equipo);
	
	List<Equipo> obtenerEquipos();
	
	Optional<Equipo> obtenerEquipo(Long equipoId);
	
	void borrarEquipo(Long equipoId);
}
