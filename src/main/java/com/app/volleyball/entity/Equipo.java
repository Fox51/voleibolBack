package com.app.volleyball.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipos")
public class Equipo {
	
	@Id
	@Column(name = "equipo_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long equipoId;
	
	@Column(name = "nombre")
	private String equipoNombre;
	
	@Column(name = "puntuacion")
	private int equipoPuntuacion;

	public Long getEquipoId() {
		return equipoId;
	}

	public void setEquipoId(Long equipoId) {
		this.equipoId = equipoId;
	}

	public String getEquipoNombre() {
		return equipoNombre;
	}

	public void setEquipoNombre(String equipoNombre) {
		this.equipoNombre = equipoNombre;
	}

	public int getEquipoPuntuacion() {
		return equipoPuntuacion;
	}

	public void setEquipoPuntuacion(int equipoPuntuacion) {
		this.equipoPuntuacion = equipoPuntuacion;
	}
	
}
