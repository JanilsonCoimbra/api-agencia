package com.recode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.dto.ContatoDTO;
import com.recode.service.ContatoService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/contato")
public class ContatoController {
	
	@Autowired
	ContatoService contact;
	
	@GetMapping
	public Page<ContatoDTO> findContact(Pageable pag) {
		return contact.findAllContact(pag);
	}
	
	@PostMapping("/enviar")
	public String saveContato(@RequestBody ContatoDTO con) {
		return contact.saveContato(con);
	}
}
