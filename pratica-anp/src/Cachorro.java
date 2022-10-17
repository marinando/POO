
public class Cachorro extends Mamífero {
	private boolean tipoLatido;

	public boolean isTipoLatido() {
		return tipoLatido;
	}

	public void setTipoLatido(boolean tipoLatido) {
		this.tipoLatido = tipoLatido;
	}

	public String setLateAlto(boolean tipoLatido) {
		String latido = "alto";
		return latido;
	}

	public String setLateBaixo(boolean tipoLatido) {
		String latido = "baixo";
		return latido;

	}

	public void falar() {
		System.out.println("Fala: Cachorros não falam. Eles latem.");
	}
}
