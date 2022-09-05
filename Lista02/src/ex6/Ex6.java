package ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		int menu = 9;
		Scanner input = new Scanner(System.in);
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		while (true) {
			System.out.println("MENU\n\nEscolha uma opção:");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1- Cadastrar\n2- Atualizar\n3- Listar\n0 - Sair");
			menu = input.nextInt();

			switch (menu) {
			case 0:
				return;
			case 1: {
				System.out.println("Cadastro.\n");
				Pessoa p = new Pessoa();
				System.out.println("Insira o nome da pessoa:");
				p.setNome(input.next());
				System.out.println("Insira o CPF:");
				p.setCpf(input.next());
				System.out.println("A idade:");
				p.setIdade(input.nextInt());
				pessoas.add(p);
				break;
			}
			case 2: {
				System.out.println("Atualizar. Escolha uma pessoa pelo identificador:\n");

				for (int i = 0; i < pessoas.size(); i++) {
					System.out.printf("\nIdentificador:%d, Nome:%s", i, pessoas.get(i).getNome());
				}
				System.out.println("\n\nEscolha um identificador:");
				int pessoaSelecionada = input.nextInt();

				System.out.println("Insira o novo nome da pessoa:");
				pessoas.get(pessoaSelecionada).setNome(input.next());
				System.out.println("Insira o novo CPF:\n");
				pessoas.get(pessoaSelecionada).setCpf(input.next());
				System.out.println("Insira a nova idade:\n");
				pessoas.get(pessoaSelecionada).setIdade(input.nextInt());
				break;
			}
			case 3: {
				System.out.println("Listar.\n");

				for (int i = 0; i < pessoas.size(); i++) {
					System.out.printf("\nIdentificador:%d, Nome:%s, Cpf:%s, Idade:%d", i, pessoas.get(i).getNome(),
							pessoas.get(i).getCpf(), pessoas.get(i).getIdade());
				}
				break;
			}
			}
		}
	}
}
