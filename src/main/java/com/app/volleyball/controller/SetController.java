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

import com.app.volleyball.entity.Set;
import com.app.volleyball.service.SetService;

@RequestMapping("sets")
@RestController
public class SetController {
	
	@Autowired
	private SetService setService;
	
	@PostMapping("/")
	public Set crear(@RequestBody Set set){
		return this.setService.crearSet(set);
	}
	
	@PutMapping("/")
	public Set actualizar(@RequestBody Set set){
		return this.setService.actualizarSet(set);
	}
	
	@GetMapping("/")
	public List<Set> obtenerTodos(){
		return this.setService.obtenerSets();
	}
	
	@GetMapping("/{setId}")
	public Optional<Set> obtenerEquipo(@PathVariable(name = "setId") Long setId){
		return this.setService.obtenerSet(setId);
	}
	
	@DeleteMapping("/{setId}")
	public void borrar(@PathVariable(name = "setId") Long setId){
		this.setService.borrarSet(setId);
	}
	
}
