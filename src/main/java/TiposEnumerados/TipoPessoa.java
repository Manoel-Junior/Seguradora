package TiposEnumerados;

/**
 * 
 * @author Manoel Jr
 *
 */

public enum TipoPessoa {
	
	FISICA("Pessoa Fisica"),
	JURIDICA("Pessoa Juridica");
	
	private String tipo;
	
	
	private TipoPessoa(String tipo){
		this.tipo = tipo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
