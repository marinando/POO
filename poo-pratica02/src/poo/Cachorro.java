package poo;

public class Cachorro extends Animal{

	public Cachorro(String nome, String raca, Float comprimento, Integer numPatas, String cor, String ecossistema){
		super.setNome(nome);
		super.setComprimento(comprimento);
		super.setCor(cor);
		super.setRaca(raca);
		super.setEcossistema(ecossistema);
		super.setNumPatas(numPatas);
	
	}
	
	public Cachorro() {
		
	}
	public void late() {
		System.out.println("Cachorro late.");
	}
}
