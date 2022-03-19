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
	@Transactional(readOnly = true)
	public ContatoDTO finContact(Long id) {
		Contato contact = contato.findById(id).get();
		ContatoDTO contactDTO = new ContatoDTO(contact);
		return contactDTO;
	}
	
	@Transactional
	public String saveContato(ContatoDTO con) {
		Contato contact = new Contato();
		contact.setNome(con.getNome());
		contact.setEmail(con.getEmail());
		contact.setMensagem(con.getMensagem());
		contato.saveAndFlush(contact);
		return "{Mensagem: 'Enviado com sucesso'}";
	}
	
	@Transactional
	public ContatoDTO UpdateContato(ContatoDTO contact){
		Contato con = contato.findById(contact.getId()).get();
		con.setId(contact.getId());
		con.setNome(contact.getNome());
		con.setEmail(contact.getEmail());
		con.setMensagem(contact.getMensagem());
		contato.saveAndFlush(con);
		return contact;
	}
	@Transactional 
	public String DeleteContato(Long id){
		contato.deleteById(id);
		return "ok";
	}
}
