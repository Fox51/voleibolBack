package com.app.volleyball.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.volleyball.entity.Equipo;
import com.app.volleyball.service.EquipoService;

@RequestMapping("equipos")
@RestController
public class EquipoController {
	
	@Autowired
	private EquipoService equipoService;
	
	@PostMapping("/")
	public Equipo crear(@RequestBody Equipo equipo){
		return this.equipoService.crearEquipo(equipo);
	}
	
	@PutMapping("/")
	public Equipo actualizar(@RequestBody Equipo equipo){
		return this.equipoService.actualizarEquipo(equipo);
	}
	
	@GetMapping("/")
	public List<Equipo> obtenerTodos(){
		return this.equipoService.obtenerEquipos();
	}
	
	@GetMapping("/{equipoId}")
	public Optional<Equipo> obtenerEquipo(@PathVariable(name = "equipoId") Long equipoId){
		return this.equipoService.obtenerEquipo(equipoId);
	}
	
	@DeleteMapping("/{equipoId}")
	public void borrar(@PathVariable(name = "equipoId") Long equipoId){
		this.equipoService.borrarEquipo(equipoId);
	}
}
