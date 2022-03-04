package com.recode.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Destino implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long destinoId;
	private String destinoName;
	private String destinoDescricao;
	private Double destinoValor;
	private String destinoFoto;
	private Date destinoData;
	private Date destinoRetornoData;
	
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
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
