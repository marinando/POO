package ex12;

import java.util.ArrayList;

/*12. Crie uma lista de dez nomes (alfanuméricos) usando uma wrapper class. Atualize um dos nomes da lista.*/

public class Ex12 {
	public static void main(String[] args) {

		ArrayList<String> alfanumericos = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			alfanumericos.add(i + "abc");
		}
		System.out.println(alfanumericos);
		alfanumericos.set(5, "novo");
		System.out.println(alfanumericos);		
		
		
	}
}
