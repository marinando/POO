
public class MainAnimal {

	public static void main(String[] args) {

		BemTeVi bemtevi = new BemTeVi();
		Vaca vaca = new Vaca();
		Papagaio papagaio = new Papagaio();
		Cachorro cachorro = new Cachorro();

		bemtevi.setNome("Bem-te-vi");
		bemtevi.setClasse("Ave");
		bemtevi.imprime();
		bemtevi.falar();
		bemtevi.voar(10);
		System.out.printf("\n__________________________________________________________________________\n");

		vaca.setNome("Vaca");
		vaca.setClasse("Mamífero");
		vaca.imprime();
		vaca.ordenhar();
		vaca.setPermiteOrdenha(true);
		vaca.falar();
		vaca.isPermiteOrdenha();
		System.out.printf("\n__________________________________________________________________________\n");

		papagaio.setNome("Papagaio");
		papagaio.setClasse("Ave");
		papagaio.imprime();
		papagaio.falar();
		papagaio.setVocabulario("Banana, Abacate, Céu");
		System.out.print("Vocabulário: ");
		System.out.print(papagaio.getVocabulario());
		System.out.printf("\n");
		papagaio.voar(2);
		System.out.printf("\n__________________________________________________________________________\n");
		
		cachorro.setNome("Cachorro");
		cachorro.setClasse("Mamífero");
		cachorro.imprime();
		cachorro.falar();
		cachorro.setTipoLatido(true);
		System.out.print("Latido: ");
		System.out.println(cachorro.setLateAlto(false));
		cachorro.setTipoLatido(false);
		System.out.print("Latido: ");
		System.out.println(cachorro.setLateBaixo(true));
		cachorro.correr();
		cachorro.setVelocidade(50);
		cachorro.getVelocidade();

		System.out.printf("\n__________________________________________________________________________\n");


	}

}
