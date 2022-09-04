package ex10;

/*Crie um vetor de String (String[]) com os biomas brasileiros: {“Amazônia”, “Mata Atlântica”, “Cerrado”,
“Caatinga”, “Pampa”, “Pantanal”}. Remova o elemento na posição 3 e realoque os demais elementos de
modo que	, ao exibir o vetor com elemento removido, o resultado seja: [“Amazônia”, “Mata Atlântica”,
“Cerrado”, “Pampa”, “Pantanal”].*/

public class Ex10 {
	public static void main(String[] args) {

		String[] biomasBrasileiros = new String[] { "Amazônia", "Mata Atlântica", "Cerrado", "Caatinga", "Pampa",
				"Pantanal" };

		for (int i = 3; i < biomasBrasileiros.length; i++) {
			if (i == biomasBrasileiros.length - 1) {
				biomasBrasileiros[i] = "";
			} else {
				biomasBrasileiros[i] = biomasBrasileiros[i + 1];
			}

		}
		for (int i = 0; i < biomasBrasileiros.length; i++) {
			System.out.println(biomasBrasileiros[i]);
		}
	}
}
