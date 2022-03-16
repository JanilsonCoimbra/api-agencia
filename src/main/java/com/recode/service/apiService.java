package com.recode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.recode.dto.DestinoDTO;
import com.recode.model.Destino;
import com.recode.model.DestinoRepository;

@Service
public class apiService {
	
	@Autowired
	DestinoRepository repository;
	
	@Transactional(readOnly = true)
	public Page<DestinoDTO> findAll(Pageable pageable) {
		Page<Destino> destino = repository.findAll(pageable);
		Page<DestinoDTO> DestDTO = destino.map(x -> new DestinoDTO(x));
		return DestDTO;
	}
	
	@Transactional(readOnly = true)
	public DestinoDTO findById(@ModelAttribute Long id ) {
		Destino destino = repository.findById(id).get();
		DestinoDTO DestDTO = new DestinoDTO(destino);
		return DestDTO;
	}

	@Transactional
	public Destino updateDest(DestinoDTO dest){

		Destino destin = repository.findById(dest.getDestinoId()).get();
		destin.setDestinoId(dest.getDestinoId());
		destin.setDestinoName(dest.getDestinoName());
		destin.setDestinoDescricao(dest.getDestinoDescricao());
		destin.setDestinoValor(dest.getDestinoValor());
		destin.setDestinoFoto(dest.getDestinoFoto());
		destin.setDestinoData(dest.getDestinoData());
		destin.setDestinoRetornoData(dest.getDestinoRetornoData());
		repository.saveAndFlush(destin);
		return destin;
	}

	@Transactional
	public String InsertDest(DestinoDTO dest){

		Destino destin = new Destino();
		destin.setDestinoName(dest.getDestinoName());
		destin.setDestinoDescricao(dest.getDestinoDescricao());
		destin.setDestinoValor(dest.getDestinoValor());
		destin.setDestinoFoto(dest.getDestinoFoto());
		destin.setDestinoData(dest.getDestinoData());
		destin.setDestinoRetornoData(dest.getDestinoRetornoData());
		repository.saveAndFlush(destin);
		return "Sucesso";
	}
	/*


*/
}
