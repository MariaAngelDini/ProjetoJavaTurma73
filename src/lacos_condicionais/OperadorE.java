package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		
//		int idade;
//		boolean carteira;
//		
//		Scanner leia = new Scanner(System.in);
//		
//		System.out.println("Digite a sua idade");
//		idade = leia.nextInt();
//		
//		System.out.println("Você tem carteira de habilitação? (true/false)");
//		carteira = leia.nextBoolean();
//		
//		
//		
//		if (idade >= 18 && carteira == true) {
//			System.out.println("Você pode digirir :)");
//		}
//		else {
//			System.out.println("Não pode dirigir :(");
//		}
		
//		----- EXEMPLO 2 -----
//		media para passar de ano é 6
//		entre 5 e 6 é recuperaçao 
//		menor que 5 reprovade
		
		float nota1, nota2, media;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if (media >= 6) {
			System.out.println("Parabéns, aprovade!");
		}
		else if (media >= 5) {
			System.out.println("Está de recupeação.");
		}
		else {
			System.out.println("Que pena, reprovade.");
		}
		
		leia.close();
	}
}
