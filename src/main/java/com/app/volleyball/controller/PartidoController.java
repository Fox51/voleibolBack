package com.app.volleyball.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.volleyball.entity.Partido;
import com.app.volleyball.service.PartidoService;

@RequestMapping("partidos")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PartidoController {
	
	@Autowired
	private PartidoService partidoService;
	
	@PostMapping("/")
	public Partido crear(@RequestBody Partido partido){
		return this.partidoService.crearPartido(partido);
	}
	
	@PutMapping("/")
	public Partido actualizar(@RequestBody Partido partido){
		return this.partidoService.actualizarPartido(partido);
	}
	
	@GetMapping("/")
	public List<Partido> obtenerTodos(){
		return this.partidoService.obtenerPartidos();
	}
	
	@GetMapping("/{partidoId}")
	public Optional<Partido> obtenerEquipo(@PathVariable(name = "partidoId") Long partidoId){
		return this.partidoService.obtenerPartido(partidoId);
	}
	
	@DeleteMapping("/{partidoId}")
	public void borrar(@PathVariable(name = "equipoId") Long partidoId){
		this.partidoService.borrarPartido(partidoId);
	}
	
	@GetMapping("/actual")
	public Partido partidoActual(){
		return this.partidoService.partidoActual();
	}
	
	
}
