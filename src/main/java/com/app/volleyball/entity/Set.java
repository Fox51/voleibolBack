package com.app.volleyball.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sets")
public class Set {
	@Id
	@Column(name = "set_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long setId;
	
	@Column(name = "numero_set")
	private byte numeroSet;
	
	@ManyToMany(targetEntity = Equipo.class, cascade = CascadeType.ALL)
	public List<Equipo> puntuaciones;

	public Long getSetId() {
		return setId;
	}

	public void setSetId(Long setId) {
		this.setId = setId;
	}

	public byte getNumeroSet() {
		return numeroSet;
	}

	public void setNumeroSet(byte numeroSet) {
		this.numeroSet = numeroSet;
	}

	public List<Equipo> getPuntuaciones() {
		return puntuaciones;
	}

	public void setPuntuaciones(List<Equipo> puntuaciones) {
		this.puntuaciones = puntuaciones;
	}
	
}
