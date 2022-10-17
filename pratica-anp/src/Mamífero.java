
public class Mamífero extends Animal {
	private int velocidade;

	public void correr() {
		System.out.println("Mamíferos podem correr, a diferença é a velocidade. Use o método setVelocidade() para determinar o valor"
				+ "e o método getVelocidade() para retornar o valor.");
	}

	public int getVelocidade() {
		System.out.printf("O cachorro pode correr a %d km/h.", velocidade);
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}
