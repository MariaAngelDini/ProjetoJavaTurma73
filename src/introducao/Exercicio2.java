package introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float mediafinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a 1ª nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Insira a 2ª nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Insira a 3ª nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Insira a 4ª nota: ");
		nota4 = leia.nextFloat();
		
		leia.close();
		
		mediafinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		
		//para definir os numeros a serem exibidos depois da virgula, use printf e %.2f para ter 2 casas
		System.out.printf("Sua média final é: %.2f " , mediafinal);
		
	
		
		
	}

}
