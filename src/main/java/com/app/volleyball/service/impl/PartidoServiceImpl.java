package com.app.volleyball.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.volleyball.dao.PartidoDao;
import com.app.volleyball.entity.Partido;
import com.app.volleyball.service.PartidoService;

@Service
public class PartidoServiceImpl implements PartidoService {

	@Autowired
	private PartidoDao partidoDao;
	
	@Override
	public Partido crearPartido(Partido partido) {
		return this.partidoDao.save(partido);
	}

	@Override
	public Partido actualizarPartido(Partido partido) {
		return this.partidoDao.saveAndFlush(partido);
	}

	@Override
	public List<Partido> obtenerPartidos() {
		return this.partidoDao.findAll();
	}

	@Override
	public Optional<Partido> obtenerPartido(Long partidoId) {
		return this.partidoDao.findById(partidoId);
	}

	@Override
	public void borrarPartido(Long partidoId) {
		this.partidoDao.deleteById(partidoId);
	}

	@Override
	public Partido partidoActual() {
		return this.partidoDao.getActual();
	}

}
