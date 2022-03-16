package com.recode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.dto.DestinoDTO;
import com.recode.model.Destino;
import com.recode.service.apiService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/destinos")
public class apiContoller {

	@Autowired
	apiService sevice;
	
	@GetMapping
	public Page<DestinoDTO> getDestinos(Pageable pageable) {
		return sevice.findAll(pageable);
	}
	
	@GetMapping("/{id}")
	public DestinoDTO getDestino(@PathVariable Long id) {
		return sevice.findById(id);
	}
	@PutMapping("/")
	public Destino updateDest(@RequestBody DestinoDTO dest){
		return sevice.updateDest(dest);

	}
	@PostMapping("/")
	public String InsertDest(@RequestBody DestinoDTO dest){
		return sevice.InsertDest(dest);

	}
}
