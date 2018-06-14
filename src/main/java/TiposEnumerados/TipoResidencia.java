package TiposEnumerados;

public enum TipoResidencia {
	
	APARTAMENTO(1, "Apartamento"),
	CASA(2, "Casa");
	
	private int codigo;
	private String descricao;
	
	private TipoResidencia(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

}
