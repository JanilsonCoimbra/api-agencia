package com.recode.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRespository extends JpaRepository<Contato, Long> {
	
}
