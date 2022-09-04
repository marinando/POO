package bytebank;

public class testaMetodo {

	public static void main(String[] args) {

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		contaDaMarcela.transfere(300, contaDoPaulo); // referência para o objeto contaDoPaulo

		if (contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("Transferência com sucesso.");
			System.out.println(contaDaMarcela.saldo);
			System.out.println(contaDoPaulo.saldo);
		
		} else {
			System.out.println("Transferência não realizada. Faltou saldo.");
		}
		
		Cliente paulo = new Cliente();
		contaDoPaulo.titular = paulo;
		contaDoPaulo.titular.nome = "Paulo Silveira";
		
	}
}
