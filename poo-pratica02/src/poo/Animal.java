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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
