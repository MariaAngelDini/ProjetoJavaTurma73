package laco_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {

		String nome;
		int contador;
		Scanner leia = new Scanner(System.in);

//		valor inicial; condição limite; contador
//		contador++ -> contador = contador + 1

		for (contador = 1; contador <= 3; contador++) {

			System.out.println("Digite o " + contador + "º nome: ");
			nome = leia.nextLine();
			System.out.println("O " + contador + "º nome é: " + nome + "\n");

		}
		leia.close();
		
		System.out.println("Saí do loop");

	}

}
