package com.app.volleyball.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "partidos")
public class Partido {
	@Id
	@Column(name = "partido_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long partidoId;
	
	@Column(name = "fecha_encuentro")
	private Date fechaEncuentro;
	
	@OneToMany(targetEntity = Set.class, cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Set> listaDeSets;

	public Long getPartidoId() {
		return partidoId;
	}

	public void setPartidoId(Long partidoId) {
		this.partidoId = partidoId;
	}

	public Date getFechaEncuentro() {
		return fechaEncuentro;
	}

	public void setFechaEncuentro(Date fechaEncuentro) {
		this.fechaEncuentro = fechaEncuentro;
	}

	public List<Set> getListaDeSets() {
		return listaDeSets;
	}

	public void setListaDeSets(List<Set> listaDeSets) {
		this.listaDeSets = listaDeSets;
	}
	
}
