package com.app.volleyball.service;

import java.util.List;
import java.util.Optional;

import com.app.volleyball.entity.Partido;

public interface PartidoService {
	
	Partido crearPartido(Partido partido);
	
	Partido actualizarPartido(Partido partido);
	
	List<Partido> obtenerPartidos();
	
	Optional<Partido> obtenerPartido(Long partidoId);
	
	void borrarPartido(Long partidoId);
	
	Partido partidoActual();
}
