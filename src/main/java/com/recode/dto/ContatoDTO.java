package com.recode.dto;

import com.recode.model.Contato;

public class ContatoDTO {
	
	public Long id;
	public String nome;
	public String Email;
	public String Mensagem;
	
	public ContatoDTO() {
		
	}

	public ContatoDTO(Long id, String nome, String email, String mensagem) {
		this.id = id;
		this.nome = nome;
		this.Email = email;
		this.Mensagem = mensagem;
	}
	
	public ContatoDTO(Contato con) {
		this.id = con.getId();
		this.nome = con.getNome();
		this.Email = con.getEmail();
		this.Mensagem = con.getMensagem();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMensagem() {
		return Mensagem;
	}

	public void setMensagem(String mensagem) {
		Mensagem = mensagem;
	}
}
