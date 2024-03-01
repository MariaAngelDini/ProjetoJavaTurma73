package laco_repeticao;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
		//leia numeros inteiros e some apenas os positivos
		//digite 0 para parar
		int numero;
		int soma = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número inteiro (digite 0 para encerrar): ");
			numero = scanner.nextInt();
			
			if(numero > 0) {
				soma += numero;
				//soma = soma + numero
			}
		}
		while (numero != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
	} 
}

