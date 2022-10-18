package poo;

public class MainAnimal {
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Bidu", "Pitbul", (float) 0.6, 4, "Caramelo", "Doméstico");
		Gato gato = new Gato("Garfield", "Listrado", (float) 0.4, 4, "Preto", "Doméstico");
		
		System.out.printf("\nCachorro\nNome: %s"
				+ "\nRaça: %s\nComprimento: %f\nCor: %s\nEcossistema: %s\nNúmero de patas: %d", cachorro.getNome(), cachorro.getRaca(), cachorro.getComprimento(), cachorro.getCor(), cachorro.getEcossistema(), cachorro.getNumPatas());
		System.out.println("\n____________________________________________________________________________________________________________________________________________________\n");
		System.out.printf("\nGato\nNome: %s"
				+ "\nRaça: %s\nComprimento: %f\nCor: %s\nEcossistema: %s\nNúmero de patas: %d", gato.getNome(), gato.getRaca(), gato.getComprimento(), gato.getCor(), gato.getEcossistema(), gato.getNumPatas());
		
			
	}
}

