package introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float n1;
		float n2;
		float n3;
		float n4; 
		float diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º número decimal");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o 2º número decimal");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o 3º número decimal");
		n3 = leia.nextFloat();
		
		System.out.println("Digite 4º número decimal");
		n4 = leia.nextFloat();
		
		leia.close();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A diferença é de: %.2f" , diferenca);

	}

}
