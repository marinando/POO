package ex7;
/*7. Crie um programa que leia dez números inteiros e armazene em uma lista de tipo primitivo. Em seguida,
exiba os dados da lista em ordem crescente e também decrescente - utilizando métodos nativos do Java.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		ArrayList<Integer> inteiros = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 9; i++) {
			System.out.println("Insira um número:\n");
			inteiros.add(input.nextInt());
		}

		input.close();
		inteiros.sort(null);
		System.out.println("Lista em ordem crescente: \n");
		System.out.println(inteiros.toString());

		inteiros.sort(Comparator.reverseOrder());
		System.out.println("\\nLista em ordem decrescente: \n");
		System.out.println(inteiros.toString());

	}
}
