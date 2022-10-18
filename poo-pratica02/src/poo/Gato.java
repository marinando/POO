package poo;

public class Gato extends Animal{
	public Gato(String nome, String raca, Float comprimento, Integer numPatas, String cor, String ecossistema){
		super.setNome(nome);
		super.setComprimento(comprimento);
		super.setCor(cor);
		super.setRaca(raca);
		super.setEcossistema(ecossistema);
		super.setNumPatas(numPatas);
		
	}
	
	public Gato() {
		
	}
	
	public void mia() {
		System.out.println("Miau, o gato tá vivo.\n");
	}

}
