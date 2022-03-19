package com.recode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	ContatoService service;
	
	@GetMapping
	public Page<ContatoDTO> findContacts(Pageable pag) {
		return service.findAllContact(pag);
	}
	@GetMapping("/{id}")
	public ContatoDTO findContact(@PathVariable Long id) {
		return service.finContact(id);
	}
	
	@PostMapping("/enviar")
	public String saveContato(@RequestBody ContatoDTO con) {
		return service.saveContato(con);
	}

	@PutMapping("/edit")
	public ContatoDTO UpdateSaveContact(@RequestBody ContatoDTO entityContato){
		return service.UpdateContato(entityContato);
	}
	
	@DeleteMapping("/{id}")
	public String ContatoDelete(@PathVariable Long id){
		return service.DeleteContato(id);
	}
}
