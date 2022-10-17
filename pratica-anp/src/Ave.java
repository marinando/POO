
public class Ave extends Animal {

	public void falar() {
		System.out.println("Algumas aves podem falar. Verifique de acordo com cada animal.");
	}

	public void voar(int valor) {
		int horas = valor;
		
		System.out.printf("Voar: A ave %s pode voar por %d horas.\n", Ave.getNome(), horas);
	}
}
