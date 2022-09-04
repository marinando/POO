package bytebank;

public class TestesReferencias {
	
	public static void main(String[] args) {
		Cliente marina = new Cliente();
		Conta contaDaMarina = new Conta();
		contaDaMarina.titular = marina;
		contaDaMarina.titular.nome = "Marina";
		
		System.out.println(contaDaMarina.titular.nome);

	}
}
