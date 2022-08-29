/*4. Crie duas Strings com o mesmo conteúdo. Compare as variáveis de três formas: utilizando os métodos
nativos equals() e equalsIgnoreCase() e o operador ==. Quais são os resultados? Todas as três formas são
válidas e adequadas para comparar Strings?*/

/*No meu teste, o equals funciona muito parecido com o ==, retornando que é verdadeiro quando as variáveis contém 
 * exatamente o mesmo conteúdo.
 * Ao utilizar equalsIgnoreCase(), é retornado verdadeiro porque o método desconsidera strings com letras maiúsculas e minúsculas.
 * */

package ex4;

public class Ex4 {
	public static void main(String[] args) {
		
		String string1 = "banana";
	String string2 = "Banana";
		
		if(string1.equals(string2)) {
			System.out.println("As variáveis são iguais -> Método Equals");
		}
		
		if (string1.equalsIgnoreCase(string2)) {
			System.out.println("As variáveis são iguais -> Método equalsIgnoreCase");
		}
		
		if (string1 == string2) {
			System.out.println("As variáveis são iguais -> Comparação simples");
		}
	}
}
