package com.fiap.gs.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fiap.gs.entity.Indicador;
import com.fiap.gs.entity.IndicadorDados;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndicadorModel {
	private Integer ano;

	private String regiao;
	@JsonIgnore
	private String label;

	@JsonIgnore
	private Double value;

	@JsonAnyGetter
	public Map<String, Double> any(){
		Map<String, Double> indicador = new HashMap<>();
		indicador.put(label, value);
		return indicador;
	}

	public IndicadorModel() {
	}

	public IndicadorModel(Integer ano, String label, Double value, String regiao) {
		this.ano = ano;
		this.label = label;
		this.value = value;
		this.regiao = regiao;
	}

	public IndicadorModel(IndicadorDados indicador) {
		this.ano = indicador.getAno();
		this.regiao = indicador.getRegiao();
		this.label = indicador.getIndicador().getLabel();
		this.value = indicador.getValor().doubleValue();
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
}
