package ex14;

import java.util.Scanner;	

/*14. 
 * 
 * Considere um programa a ser feito no console do Eclipse IDE que deve calcular a média final (MF) de
	um(a) discente seguindo a fórmula disponível no Plano de Ensino da disciplina de Programação Orientada
	a Objetos. Ao final, deve informar:
	
		● Se MF >= 6: Aprovado(a)
		● Se MF >= 4 e < 6: Recuperação
		● Se MF < 4: Reprovado(a)
		
	Observações: o programa não deve permitir a entrada de dados alfanuméricos ou nulos.
	Crie um método exclusivo para realizar o cálculo da média. Pense nos parâmetros que o método deve ter.
	Realizar leitura de dados (nomeAluno e notas) pelo teclado via console.*/

public class Ex14 {

	public static double mediaNota(double nota1, double nota2, double nota3) {

		double media = 0.0;
		media = ((nota1 + nota2 + nota3) / 3);
		return media;
	}

	public static void main(String[] args) {
		double n1 = 0.0;
		double n2 = 0.0;
		double n3 = 0.0;
		String nome = new String();

		Scanner input = new Scanner(System.in);
		System.out.println("Qual é o seu nome?\n");

		while (true) {
			nome = input.nextLine();
			if (nome == null || nome == "") {
				System.out.println("Valor nulo inserido. Insira um dado válido.");
			} else {
				boolean numeroEncontrado = false;
				for (int i = 0; i < nome.length(); i++) {
					char letra = nome.charAt(i); // charAt pega o caractere da posição da string
					if (Character.isDigit(letra)) {
						numeroEncontrado = true;
						break;
					}
				}
				if (numeroEncontrado == true) {
					System.out.println("Números não são permitidos para nome. Tente novamente");
				} else {
					break;
				}
			}
		}

		System.out.println("Insira sua nota 1:\n");
		n1 = input.nextDouble();
		System.out.println("Insira sua nota 2:\n");
		n2 = input.nextDouble();
		System.out.println("Insira sua nota 3:\n");
		n3 = input.nextDouble();
		input.close();

		double resultado = mediaNota(n1, n2, n3);

		if (resultado >= 6) {
			System.out.printf(nome + " está Aprovado.\nMédia: %.2f", resultado);
		} else if (resultado >= 4 && resultado < 6) {
			System.out.printf(nome + " está em Recuperação.\nMédia: %.2f", resultado);
		} else if (resultado < 4) {
			System.out.printf(nome + " está Reprovado.\nMédia: %.2f", resultado);
		}

	}
}
