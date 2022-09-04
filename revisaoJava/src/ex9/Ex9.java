package ex9;
/*9. Crie uma lista de String usando a estrutura de dados ArrayList. 
 * 
 * Preencha esta lista com a mesma quantidade de elementos utilizados no Exercício 08. 
 * Em seguida, exiba no console: os dados da lista (um a um), o tamanho da lista e verifique se está vazia. Além disso, exiba apenas o último elemento acessando-o
diretamente.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<String> caracteres = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Insira o valor:\n");
			caracteres.add(input.next());
		}
		input.close();

		System.out.print("\nValores do Vetor: [");
//		System.out.print(String.join(", ", caracteres)); ele junta as strings inputadas e coloca o delimitador conforme vc quiser

		for (int i = 0; i < caracteres.size(); i++) {
			System.out.print(caracteres.get(i));
			if (i < caracteres.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.printf("\n\nTamanho do vetor: %d", caracteres.size());
		if (caracteres.size() == 0) {
			System.out.println("Vetor vazio");
		} else {
			System.out.println("\nO vetor foi preenchido corretamente.");
		}

		System.out.printf("\nÚltima posição inserida no vetor: %s.", caracteres.get(caracteres.size() - 1));

	}
}
