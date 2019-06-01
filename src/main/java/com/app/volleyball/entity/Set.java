package com.app.volleyball.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "sets")
public class Set {
	@Id
	@Column(name = "set_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long setId;
	
	@Column(name = "numero_set")
	private byte numeroSet;
	
    @ManyToOne
    @JsonIgnoreProperties("listaDeSets")
    private Partido partido;

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

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	
}
