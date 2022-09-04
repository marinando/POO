package bytebank;

public class Conta {

	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor; // se refere a conta a qual o método foi invocado.
	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {

		boolean testeTranferencia = saca(valor);
		if (testeTranferencia) {
			saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

//		if (this.saldo >= valor) {
//			this.saldo -= valor;
//			destino.deposita(valor);
//			return true;
//		} else {
//			return false;
//		}
	}

}
