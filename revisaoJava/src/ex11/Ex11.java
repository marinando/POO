package ex11;

import java.util.ArrayList;
import java.util.Random;

/*11. Crie uma lista de salário (números reais ℝ) usando um tipo primitivo adequado. Preencha 100 elementos
nesta lista de forma aleatória (valores entre 1000 e 5000) utilizando métodos nativos do Java. Liste o maior
salário, o menor salário e a média dos salários.*/

public class Ex11 {

	public static void main(String[] args) {

		ArrayList<Double> salarios = new ArrayList<Double>();
		Random r = new Random(); // Criando a instância do objeto Random

		for (int i = 0; i <= 99; i++) {
			double salariosRandom = 1000.0 + (5000.0 - 1000.0) * r.nextDouble();
			salarios.add(salariosRandom);
		}

//		Em caso de ver a lista random
		System.out.println("Lista de Salários:");

		for (Double double1 : salarios) {
			System.out.printf("\n %.2f", double1);
		}

		Double menor = salarios.get(0);
		Double maior = salarios.get(0);
		Double soma = 0.0;

		for (Double double1 : salarios) {
			if (double1 > maior) {
				maior = double1;
			} else if (double1 < menor) {
				menor = double1;
			}
			soma += double1;
		}
		Double media = soma / salarios.size();

		System.out.printf("\n\n	Maior salário: R$%.2f\n", maior);
		System.out.printf("Menor salário: R$%.2f\n", menor);
		System.out.printf("Média dos salários: R$%.2f\n", media);
	}
}
