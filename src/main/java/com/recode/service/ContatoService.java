package com.recode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recode.dto.ContatoDTO;
import com.recode.model.Contato;
import com.recode.model.ContatoRespository;

@Service
public class ContatoService {
	
	@Autowired
	ContatoRespository contato;
	
	@Transactional(readOnly = true)
	public Page<ContatoDTO> findAllContact(Pageable pag) {
		Page<Contato> contact = contato.findAll(pag);
		Page<ContatoDTO> contatoDto = contact.map(x -> new ContatoDTO(x));
		return contatoDto;
	}
	
	@Transactional
	public String saveContato(ContatoDTO con) {
		Contato contact = new Contato();
		contact.setNome(con.getNome());
		contact.setNome(con.getEmail());
		contact.setNome(con.getMensagem());
		
		contato.save(contact);
		return "{Mensagem: 'Enviado com sucesso'}";
	}
}
