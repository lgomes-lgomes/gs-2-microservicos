package com.fiap.gs.controller;

import com.fiap.gs.model.ObjetivoModel;
import com.fiap.gs.repository.ObjetivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	@Autowired
	private ObjetivoRepository objetivoRepository;

	@GetMapping
	public List<ObjetivoModel> getObjetivos() {
		return objetivoRepository.findAll().stream().map(objetivo -> {
			return new ObjetivoModel(objetivo);
		}).toList();
	}
}
