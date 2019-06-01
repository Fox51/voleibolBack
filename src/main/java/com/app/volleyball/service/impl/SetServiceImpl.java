package com.app.volleyball.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.volleyball.dao.SetDao;
import com.app.volleyball.entity.Set;
import com.app.volleyball.service.SetService;

@Service
public class SetServiceImpl implements SetService {
	
	@Autowired
	private SetDao setDao;
	
	@Override
	public Set crearSet(Set set) {
		return this.setDao.save(set);
	}

	@Override
	public Set actualizarSet(Set set) {
		return this.setDao.saveAndFlush(set);
	}

	@Override
	public List<Set> obtenerSets() {
		return this.setDao.findAll();
	}

	@Override
	public Optional<Set> obtenerSet(Long setId) {
		return this.setDao.findById(setId);
	}

	@Override
	public void borrarSet(Long setId) {
		this.setDao.deleteById(setId);
	}

}
