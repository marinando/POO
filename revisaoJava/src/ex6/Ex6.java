package ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/* Crie um programa que leia dez salários e armazene em um vetor de tipo primitivo. Em seguida, exiba os
dados do vetor em ordem crescente e também decrescente - utilizando métodos nativos do Java.*/

public class Ex6 {

	public static void main(String[] args) {

		ArrayList<Double> salarios = new ArrayList<>();
		Scanner salariosScan = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.printf("Insira o salário [%d]:", i);
			salarios.add(salariosScan.nextDouble());
		}

		salariosScan.close();

		salarios.sort(null); // com o parâmetro null, ele ordena a lista por padrão por ordem crescente 
		System.out.println("\nOrdem crescente:");
		System.out.println(salarios.toString()); //retorna uma string representando o objeto.

		System.out.println("\nOrdem decrescente:");
		salarios.sort(Comparator.reverseOrder()); // retorna a lista em ordem decrescente 
		System.out.println(salarios.toString());
	}
}