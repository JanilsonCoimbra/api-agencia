package com.recode.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.model.Destino;
import com.recode.model.DestinoRepository;

@RestController
@CrossOrigin(origins = "*")
public class apiContoller {

	@Autowired
	DestinoRepository destinos;
	
	@RequestMapping("/destinos")
	public List<Destino> getDestinos() {
		
		return destinos.findAll();
	}
	@RequestMapping("/destinos/{id}")
	public Destino getDestino(@PathVariable Long id) {
		return destinos.findById(id).get();
	}
}
