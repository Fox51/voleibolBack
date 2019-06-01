package com.app.volleyball.service;

import java.util.List;
import java.util.Optional;

import com.app.volleyball.entity.Set;

public interface SetService {
	
	Set crearSet(Set set);
	
	Set actualizarSet(Set set);
	
	List<Set> obtenerSets();
	
	Optional<Set> obtenerSet(Long setId);
	
	void borrarSet(Long setId);
}
