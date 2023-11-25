package com.fiap.gs.controller;

import com.fiap.gs.entity.Indicador;
import com.fiap.gs.model.IndicadorModel;
import com.fiap.gs.repository.IndicadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/indicador")
public class IndicadoresController {
	@Autowired
	private IndicadorRepository indicadorRepository;

	@GetMapping("/{id}")
	public List<IndicadorModel> indicadorModelList(@PathVariable("id") String id) {
		Indicador indicador = indicadorRepository.findById(id).orElse(null);
		if (indicador == null) return new LinkedList<>();

		return indicador.getDados().stream().map(IndicadorModel::new).toList();
	};
}
