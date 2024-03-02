package vetor_matriz;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {

		int numeros[][] = new int[3][3];
		int l, c;
		int somaP = 0;
		int somaS = 0;

		Scanner leia = new Scanner(System.in);

		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {

				System.out.println("Digite um número inteiro:");
				numeros[l][c] = leia.nextInt();
			}
		}

		System.out.println("Elementos na diagonal principal");
		for (l = 0; l < 3; l++) {
			System.out.print(numeros[l][l] + " ");
		}
		
		System.out.println("\nElementos na diagonal secundária");
		for (l = 0; l < 3; l++) {
			System.out.print(numeros[l][2 - l] + " ");
		}
		
		for (l = 0; l < 3; l++) {
			somaP += numeros[l][l];
		}
		
		System.out.println("\nSoma da diagonal principal: " + somaP);
		
		for (l = 0; l < 3; l++) {
			somaS += numeros[l][2 - l];
		}
		
		System.out.println("\nSoma da diagonal secundária: " + somaS);
	}
}