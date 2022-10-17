package ImplementacaoDiagrama;

public class Cliente extends Pessoa {
	private Integer nrConta = 0;
	private Double saldo = 0.0;


	public Double sacar (Double valor) { 
		
		Double saldo = getSaldo();
		if (saldo > valor) {
			
			saldo -= valor;
			this.setSaldo(saldo);
			return saldo;
		}
		else {
			System.out.println("Saldo insuficiente na conta. A operação não foi realizada");
			return saldo;
		}
	}
	
	public void depositar (Double valor) {
		Double saldo = getSaldo();
		saldo += valor;
		this.setSaldo(saldo);
	}
	
	public Double mostrarSaldo() {
		return saldo;	
	}

	public Integer getNrConta() {
		return nrConta;
	}

	public void setNrConta(Integer nrConta) {
		this.nrConta = nrConta;
	}

	private Double getSaldo() {
		return saldo;
	}

	private void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}

