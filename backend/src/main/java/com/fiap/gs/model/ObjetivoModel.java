package com.fiap.gs.model;

import com.fiap.gs.entity.Objetivo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjetivoModel {
	private String id;
	private Map<String, String> objetivos;
	private List<Map<String, String>> indicadores;

	public ObjetivoModel() {
	}

	public ObjetivoModel(String id, Map<String, String> objetivos, List<Map<String, String>> indicadores) {
		this.id = id;
		this.objetivos = objetivos;
		this.indicadores = indicadores;
	}

	public ObjetivoModel(Objetivo objetivo) {
		this.id = objetivo.getId();
		this.objetivos = new HashMap<String, String>();
		this.objetivos.put("Global", objetivo.getObjetivoGlobal());
		this.objetivos.put("Brasil", objetivo.getObjetivoBrasil());
		this.indicadores = objetivo.getIndicadorList().stream().map(indicador -> {
			Map<String, String> ind = new HashMap<>();
			ind.put(indicador.getIdIndicador(), indicador.getDescricao());
			return ind;
		}).toList();
	};

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, String> getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(Map<String, String> objetivos) {
		this.objetivos = objetivos;
	}

	public List<Map<String, String>> getIndicadores() {
		return indicadores;
	}

	public void setIndicadores(List<Map<String, String>> indicadores) {
		this.indicadores = indicadores;
	}
}
