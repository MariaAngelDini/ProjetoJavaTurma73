package laco_repeticao;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		
//		leia 2 números e print se forem multiplos de 3 e 5
		int n1, n2;
		int contador;
		
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("Insira um número:");
		 n1 = leia.nextInt();
		
		 System.out.println("Insira mais um número:");
		 n2 = leia.nextInt();
		 
		 leia.close();
		 
		 if (n1 > n2) {
			 System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo.");
		 } 
		 else {
			 System.out.println("Resulado:");
		 }
		 
		 for (contador = n1; contador <= n2; contador++) {
			 if (contador % 3 == 0 && contador % 5 == 0 ) {
				 System.out.println(contador + " é multiplo de 3 e 5!");
			 }
		 }
	}

}
