package vetor_matriz;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		
		
		int vetor[] = new int[10];
		int indice;
		int soma = 0;
		double media;
		
		Scanner leia = new Scanner(System.in);
		
		for (indice = 0; indice < vetor.length; indice++) {
			System.out.println("Insira um numero inteiro:");
			vetor[indice] = leia.nextInt();
		}
		
		System.out.println("Elementos nos indices impares do vetor: ");
		for (indice = 1; indice < vetor.length; indice += 2) {
            System.out.print(vetor[indice] + " ");
		
		}
		
		System.out.println();
		
		System.out.println("Elementos pares dentro do vetor:");
		for (indice = 0; indice < vetor.length; indice++) {
			if (vetor[indice] % 2 == 0) {
				System.out.print(vetor[indice] + " ");
			}
		}
		
		System.out.println();
		
		for (indice = 0; indice < vetor.length; indice++) {
			soma += vetor[indice];
		}
		
		media = soma / vetor.length ;
		
		System.out.println("Soma de todos os elementos dentro do vetor: " + soma);
		System.out.println("Média dos elementos do vetor: " + media);
	}

}
