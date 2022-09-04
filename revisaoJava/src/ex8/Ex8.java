package ex8;

import java.util.Scanner;

/*8. Crie um vetor de String com tamanho definido e limitado. Preencha este vetor utilizando algum laço de
repetição (for each, for ou while). 

Em seguida, exiba no console os dados do vetor (um a um), o tamanho dele e verifique se está vazio. 
Além disso, exiba apenas o último elemento acessando-o diretamente.
*/

public class Ex8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] caracteres = new String[10];
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println("Insira o valor:\n");
			caracteres[i] = input.next();
		}
		input.close();

		System.out.println("\nValores do Vetor:");
//		System.out.print(String.join(", ", caracteres)); ele junta as strings inputadas e coloca o delimitador conforme vc quiser
		System.out.print("[");
		for (int i = 0; i < caracteres.length; i++) {
			System.out.print(caracteres[i]);
			if (i < caracteres.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.printf("\n\nTamanho do vetor: %d", caracteres.length);
		if (caracteres.length == 0) {
			System.out.println("Vetor vazio");
		} else {
			System.out.println("\nO vetor foi preenchido corretamente.");
		}

		System.out.printf("\nÚltima posição inserida no vetor: %s.", caracteres[caracteres.length - 1]);

	}
}
