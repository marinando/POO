package ImplementacaoDiagrama;

import java.util.ArrayList;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
				
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		ArrayList<Cliente> clientesLista = new ArrayList<Cliente>();
		
		// criar valores da instancia do cliente1
		cliente1.setDataNasc(LocalDate.of(1999, 5, 03));
		cliente1.setNome("Gabriel Maria dos Santos");
		cliente1.setEmail("gabriel.santos@outlook.com");
		cliente1.setNrConta(126);
		cliente1.depositar(5000.00);
		
		// criar valores da instancia do cliente2
		cliente2.setDataNasc(LocalDate.of(1997, 3, 9));
		cliente2.setNome("Marcos José dos Santos");
		cliente2.setEmail("marcos.jose@outlook.com");
		cliente2.setNrConta(125);
		cliente2.depositar(10000.00);

		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();		
		ArrayList<Funcionario> funcionariosLista = new ArrayList<Funcionario>();
		
		// criar valores da instancia do funcionario1
		funcionario1.setNome("Fabiano Cruz Monteiro");
		funcionario1.setDataContratacao(LocalDate.of(2015, 12, 8));
		funcionario1.setDataNasc(LocalDate.of(1987, 8, 24));
		funcionario1.setEmail("fabiano.monteiro@gmail.com");
		funcionario1.setNrRegistro(21);
		
		// criar valores da instancia do funcionario2
		funcionario2.setNome("Benício José Silva");
		funcionario2.setDataContratacao(LocalDate.of(2014, 12, 9));
		funcionario2.setDataNasc(LocalDate.of(1988, 9, 25));
		funcionario2.setEmail("benicio.jose@gmail.com");
		funcionario2.setNrRegistro(22);
		
		funcionariosLista.add(funcionario1);
		funcionariosLista.add(funcionario2);
		clientesLista.add(cliente1);
		clientesLista.add(cliente2);
		
		Double saldoInicial = cliente1.mostrarSaldo();
		cliente1.sacar(500.00);
		if (cliente1.mostrarSaldo() < saldoInicial) {
			System.out.println("saque realizado com sucesso da conta do cliente1 " + cliente1.getNome() + " novo saldo " + cliente1.mostrarSaldo());
		}

		Double saldoInicial2 = cliente2.mostrarSaldo();
		cliente2.depositar(500.00);
		if ((saldoInicial2 + 500.00) == cliente2.mostrarSaldo()) {
			System.out.println("deposito realizado com sucesso da conta do cliente2 " + cliente2.getNome() + " novo saldo " + cliente2.mostrarSaldo());
		}

		System.out.println("clientes: ");
		for (Cliente item : clientesLista) {
			System.out.println("nome: " + item.getNome()  + "nascimento: " + item.getDataNasc() + " email: " + item.getEmail() + " nrConta: " + item.getNrConta() + " saldo: " + item.mostrarSaldo());
		}

		System.out.println("funcionarios: ");
		for (Funcionario item : funcionariosLista) {
			System.out.println("nome: " + item.getNome()  + "nascimento: " + item.getDataNasc() + " email: " + item.getEmail() + " contratacao: " + item.getDataContratacao() + " registro: " + item.getNrRegistro());
		}
	}

}
