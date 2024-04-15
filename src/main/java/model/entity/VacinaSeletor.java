package model.entity;

public class VacinaSeletor {
	
	private String nomePais;
	private String nomePesquisador;
	private String nomeVacina;
	
	public VacinaSeletor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VacinaSeletor(String nomePais, String nomePesquisador, String nomeVacina) {
		super();
		this.nomePais = nomePais;
		this.nomePesquisador = nomePesquisador;
		this.nomeVacina = nomeVacina;
	}

	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}

	public String getNomePesquisador() {
		return nomePesquisador;
	}

	public void setNomePesquisador(String nomePesquisador) {
		this.nomePesquisador = nomePesquisador;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}
	
	

}
