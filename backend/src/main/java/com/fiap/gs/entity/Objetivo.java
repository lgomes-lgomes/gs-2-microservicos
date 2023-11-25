package com.fiap.gs.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "OBJETIVO")
public class Objetivo {
	@Id
	@Column(name = "id_objetivo", length = 10)
	private String id;

	@Column(name = "objetivo_global")
	private String objetivoGlobal;

	@Column(name = "objetivo_brasil")
	private String objetivoBrasil;

	@OneToMany(mappedBy = "objetivo")
	private List<Indicador> indicadorList;

	public Objetivo() {
	}

	public Objetivo(String id, String objetivoGlobal, String objetivoBrasil) {
		this.id = id;
		this.objetivoGlobal = objetivoGlobal;
		this.objetivoBrasil = objetivoBrasil;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObjetivoGlobal() {
		return objetivoGlobal;
	}

	public void setObjetivoGlobal(String objetivoGlobal) {
		this.objetivoGlobal = objetivoGlobal;
	}

	public String getObjetivoBrasil() {
		return objetivoBrasil;
	}

	public void setObjetivoBrasil(String objetivoBrasil) {
		this.objetivoBrasil = objetivoBrasil;
	}

	public List<Indicador> getIndicadorList() {
		return indicadorList;
	}

	public void setIndicadorList(List<Indicador> indicadorList) {
		this.indicadorList = indicadorList;
	}
}
