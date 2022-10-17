
public class Vaca extends Mamífero {

	private boolean permiteOrdenha;

	public void ordenhar() {
		System.out.println("\nVacas podem ou não ser ordenhadas. "
				+ "\nUse o método setPermiteOrdenha() para adicionar se ela poderá, ou não, ser ordenhada.");		
	}

	@Override
	public void falar() {
		System.out.println("Fala: Vaca não fala");
	}

	public boolean isPermiteOrdenha() {
		if(permiteOrdenha == true) {
			System.out.println("Ordenha: permitida\n");
			return permiteOrdenha;
		}
		else {
			System.out.println("Ordenha: não permitida\n");
			return permiteOrdenha;
		}
	}

	public void setPermiteOrdenha(boolean permiteOrdenha) {
		this.permiteOrdenha = permiteOrdenha;
	}
}
