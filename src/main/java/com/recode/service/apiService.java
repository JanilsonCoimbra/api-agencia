package com.recode.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.recode.model.Destino;
import com.recode.model.DestinoRepository;

@Service
public class apiService {
	
	@Autowired
	DestinoRepository repository;
	
	@Transactional(readOnly = true)
	public Destino getDestino(Long id) {
		Optional<Destino> destino = repository.findById(id);
		return destino.get();
	}

}
