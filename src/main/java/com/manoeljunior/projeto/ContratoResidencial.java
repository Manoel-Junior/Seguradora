package com.manoeljunior.projeto;

import TiposEnumerados.TipoResidencialEnum;
import TiposEnumerados.Zona;

public class ContratoResidencial extends Contrato {
	
	private String endereco;
	private Zona zona;
	private TipoResidencialEnum tipoResidencial;
	
	public Float obterValorSeguro() {
		// TODO Auto-generated method stub
		return 0.0f;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Zona getZona() {
		return zona;
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public TipoResidencialEnum getTipoResidencial() {
		return tipoResidencial;
	}
	
	public void setTipoResidencial(TipoResidencialEnum tipoResidencial) {
		this.tipoResidencial = tipoResidencial;
	}

	//
	
}
