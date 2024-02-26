package introducao;

import java.util.Scanner;

public class ExercicioPratica1 {

	public static void main(String[] args) {
		
		int v1;
		int v2;
		int soma;
		int dif;
		int mult;
		int div;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		v1 = leia.nextInt();
		
		System.out.println("Digite mais um número inteiro:");
		v2 = leia.nextInt();
		
		leia.close();
		
		soma = v1 + v2;
		
		dif = v1 - v2; 
		
		mult = v1 * v2;
		
		div = v1 / v2;
		
		System.out.println("Soma:" + soma);
		System.out.println("Diferença:" + dif);
		System.out.println("Multiplicação:" + mult);
		System.out.println("Divisão:" + div);
		
		
	}

}
