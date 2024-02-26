package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variáveis
		String nome ;
		int idade;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira sua idade: ");
		idade = leia.nextInt();
		
		leia.close();
		
		// Saída de dados
		// Concatenação(+): juntar um texto com 1 ou mais váriaveis/constantes 
		System.out.println("Bom dia, " + nome);
		System.out.println("A sua idade é " + idade + " anos.");
	}

}
