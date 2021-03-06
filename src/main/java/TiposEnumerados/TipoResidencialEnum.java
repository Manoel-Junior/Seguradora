package TiposEnumerados;

public enum TipoResidencialEnum {
	
		APARTAMENTO (1, "Apartamento"),
		CASA (2, "Casa");
	
	private int codigo;
    private String descricao;
    
    private TipoResidencialEnum(int codigo, String descricao) {
    	this.codigo = codigo;
    	this.descricao = descricao;
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
