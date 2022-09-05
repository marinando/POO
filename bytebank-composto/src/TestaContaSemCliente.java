
public class TestaContaSemCliente {
	public static void main(String[] args) {
			
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
		contaDaMarcela.titular.nome = "Marcela"; // foi na conta da marcela, depois em titular, e depois na flecha q apontou pro nome
//		para então colocar "Marcela"
		System.out.println(contaDaMarcela.titular.nome);
	}
}
