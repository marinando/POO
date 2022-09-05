package ex5;

import java.util.ArrayList;

public class PessoaMain {
	public static void main(String[] args) {

		ArrayList<Pessoa> p = new ArrayList<Pessoa>();

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Marina");
		pessoa1.setCpf("111.111.111.00");
		pessoa1.setIdade(23);
		p.add(pessoa1);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Jubileu");
		pessoa2.setCpf("222.222.222.0X");
		pessoa2.setIdade(49);
		p.add(pessoa2);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Fernanda");
		pessoa3.setCpf("451.234.323.X0");
		pessoa3.setIdade(21);
		p.add(pessoa3);

		Pessoa pessoa4 = new Pessoa();
		pessoa4.setNome("Gilmar");
		pessoa4.setCpf("999.431.111.20");
		pessoa4.setIdade(58);
		p.add(pessoa4);
		
		Pessoa pessoa5 = new Pessoa();
		pessoa5.setNome("Bruno");
		pessoa5.setCpf("112.131.115.45");
		pessoa5.setIdade(65);
		p.add(pessoa5);

		System.out.println("Lista de Pessoas:");
		for (Pessoa pessoa : p) {
			System.out.printf("\n Nome: %s", pessoa.getNome());
			System.out.printf("\n CPF: %s", pessoa.getCpf());
			System.out.printf("\n Idade: %s", pessoa.getIdade());
			System.out.println();
		}

	}
}
