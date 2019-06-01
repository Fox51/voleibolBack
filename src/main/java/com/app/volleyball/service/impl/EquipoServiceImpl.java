package com.app.volleyball.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.volleyball.dao.EquipoDao;
import com.app.volleyball.entity.Equipo;
import com.app.volleyball.service.EquipoService;

@Service
public class EquipoServiceImpl implements EquipoService {

	@Autowired
	private EquipoDao equipoDao;
	
	@Override
	public Equipo crearEquipo(Equipo equipo) {
		return this.equipoDao.save(equipo);
	}

	@Override
	public Equipo actualizarEquipo(Equipo equipo) {
		return this.equipoDao.saveAndFlush(equipo);
	}

	@Override
	public List<Equipo> obtenerEquipos() {
		return this.equipoDao.findAll();
	}

	@Override
	public Optional<Equipo> obtenerEquipo(Long equipoId) {
		return this.equipoDao.findById(equipoId);
	}

	@Override
	public void borrarEquipo(Long equipoId) {
		this.equipoDao.deleteById(equipoId);
	}

}
