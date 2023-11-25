package com.fiap.gs.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "INDICADOR")
public class Indicador {
	@Id
	@Column(name = "id_indicador", length = 10)
	private String idIndicador;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "label", length = 20)
	private String label;

	@ManyToOne
	@JoinColumn(name = "id_objetivo")
	private Objetivo objetivo;

	@OneToMany(mappedBy = "indicador")
	private List<IndicadorDados> dados;

	public Indicador() {
	}

	public Indicador(String idIndicador, String descricao, String label, Objetivo objetivo) {
		this.idIndicador = idIndicador;
		this.descricao = descricao;
		this.label = label;
		this.objetivo = objetivo;
	}

	public String getIdIndicador() {
		return idIndicador;
	}

	public void setIdIndicador(String idIndicador) {
		this.idIndicador = idIndicador;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Objetivo getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}

	public List<IndicadorDados> getDados() {
		return dados;
	}

	public void setDados(List<IndicadorDados> dados) {
		this.dados = dados;
	}
}
