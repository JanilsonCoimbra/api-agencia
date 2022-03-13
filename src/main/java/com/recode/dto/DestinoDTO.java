package com.recode.dto;

import java.util.Date;

import com.recode.model.Destino;

public class DestinoDTO {

	private long destinoId;
	private String destinoName;
	private String destinoDescricao;
	private Double destinoValor;
	private String destinoFoto;
	private Date destinoData;
	private Date destinoRetornoData;
	
	public DestinoDTO() {
		
	}

	public DestinoDTO(long destinoId, String destinoName, String destinoDescricao, Double destinoValor,
			String destinoFoto, Date destinoData, Date destinoRetornoData) {

		this.destinoId = destinoId;
		this.destinoName = destinoName;
		this.destinoDescricao = destinoDescricao;
		this.destinoValor = destinoValor;
		this.destinoFoto = destinoFoto;
		this.destinoData = destinoData;
		this.destinoRetornoData = destinoRetornoData;
	}
	
	public DestinoDTO(Destino destino) {
		
		destinoId = destino.getDestinoId();
		destinoName = destino.getDestinoName();
		destinoDescricao = destino.getDestinoDescricao();
		destinoValor = destino.getDestinoValor();
		destinoFoto = destino.getDestinoFoto();
		destinoData = destino.getDestinoData();
		destinoRetornoData = destino.getDestinoRetornoData();
	}

	public long getDestinoId() {
		return destinoId;
	}

	public void setDestinoId(long destinoId) {
		this.destinoId = destinoId;
	}

	public String getDestinoName() {
		return destinoName;
	}

	public void setDestinoName(String destinoName) {
		this.destinoName = destinoName;
	}

	public String getDestinoDescricao() {
		return destinoDescricao;
	}

	public void setDestinoDescricao(String destinoDescricao) {
		this.destinoDescricao = destinoDescricao;
	}

	public Double getDestinoValor() {
		return destinoValor;
	}

	public void setDestinoValor(Double destinoValor) {
		this.destinoValor = destinoValor;
	}

	public String getDestinoFoto() {
		return destinoFoto;
	}

	public void setDestinoFoto(String destinoFoto) {
		this.destinoFoto = destinoFoto;
	}

	public Date getDestinoData() {
		return destinoData;
	}

	public void setDestinoData(Date destinoData) {
		this.destinoData = destinoData;
	}

	public Date getDestinoRetornoData() {
		return destinoRetornoData;
	}

	public void setDestinoRetornoData(Date destinoRetornoData) {
		this.destinoRetornoData = destinoRetornoData;
	}
	
}
