package lacos_condicionais;

import java.util.Scanner;

public class ExercicoPraticoSwitch2 {

	public static void main(String[] args) {
		
		float n1, n2;
		int opcao;
		float resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número:");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o operador: (1-soma/ 2-subtração/ 3-multiplicação/ 4-divisão)");
		opcao = leia.nextInt();
		
		leia.close();
		
		switch (opcao) {
		case 1:
			resultado = (float) n1 + n2;
			System.out.println("A soma dos números é: " + resultado);	
			break;
			
		case 2:
			resultado = (float) n1 - n2;
			System.out.println("A subtração dos números é: " + resultado);	
			break;
			
		case 3:
			resultado = (float) n1 * n2;
			System.out.println("A multiplicação dos números é: " + resultado);	
			break;
			
		case 4:
			resultado = (float) n1 / n2;
			System.out.println("A divisão dos números é: " + resultado);	
			break;
			
			default: 
				System.out.println("Opção inválida.");
		}
		

	}

}
