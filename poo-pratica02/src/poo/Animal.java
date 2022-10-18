package poo;

public abstract class Animal {
	private String nome;
	private String raca;
	private Float comprimento;
	private Integer numPatas;
	private String cor;
	private String ecossistema;
	
	public void caminha() {
		System.out.println("Animais domésticos tem caminha");
	}

	public String getNome() {
		return nome;
	}

	public String getRaca() {
		return raca;
	}

	public Float getComprimento() {
		return comprimento;
	}

	public Integer getNumPatas() {
		return numPatas;
	}

	public String getCor() {
		return cor;
	}

	public String getEcossistema() {
		return ecossistema;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}

	public void setNumPatas(Integer numPatas) {
		this.numPatas = numPatas;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setEcossistema(String ecossistema) {
		this.ecossistema = ecossistema;
	}

}
