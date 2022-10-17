
public class Animal {

	private static String nome;
	protected String classe;

	public void imprime() {
		System.out.printf("Animal: %s\nClasse: %s\n", Animal.nome, this.classe);
	}

	public void falar() {
		System.out.println("Verificar a classe do animal. Nesse projeto, apenas a ave do tipo Papagaio possui a função de fala.");
	}

	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Animal.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

}
