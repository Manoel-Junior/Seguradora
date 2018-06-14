package com.manoeljunior.projeto;

import TiposEnumerados.TipoPessoa;

public class Cliente {
	
	private int codigo;
	private String nome;
	private TipoPessoa tipoPessoa;
	
	
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}


	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}


	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	//
	
}
