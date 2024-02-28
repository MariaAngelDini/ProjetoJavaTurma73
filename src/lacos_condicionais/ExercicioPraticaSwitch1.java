package lacos_condicionais;

import java.util.Scanner;

public class ExercicioPraticaSwitch1 {

	
	public static void main(String[] args) {
		
		int opcao;
		int quantidade;
		float valortotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("************* MENU ****************");
		System.out.println("Cód.        Produto            Preço");
		System.out.println("1-       Cachorro-quente      10,00");
		System.out.println("2-       X-Salada             15,00");
		System.out.println("3-       X-Bacon              18,00");
		System.out.println("4-       Bauru                12,00");
		System.out.println("5-       Refrigerante          8,00");
		System.out.println("6-       Suco de Laranja      13,00");
		
		System.out.println("Por favor, digite o codigo do produto desejado");
		opcao = leia.nextInt();
		
		System.out.println("Por favor, digite a quantidade do produto");
		quantidade = leia.nextInt();
		
		leia.close();
		
		
		switch (opcao) {
		case 1:  
			valortotal = (float) (quantidade * 10.0); 
			System.out.println("Valor total do pedido: " + valortotal);
			break;
			
		case 2:  
			valortotal = (float) (quantidade * 15.0); 
			System.out.println("Valor total do pedido: " + valortotal);
			break;
			
		case 3:  
			valortotal = (float) (quantidade * 18.0); 
			System.out.println("Valor total do pedido: " + valortotal);
			break;
			
		case 4:  
			valortotal = (float) (quantidade * 12.0); 
			System.out.println("Valor total do pedido: " + valortotal);
			break;
			
		case 5:  
			valortotal = (float) (quantidade * 8.0); 
			System.out.println("Valor total do pedido: " + valortotal);
			break;
			
		case 6:  
			valortotal = (float) (quantidade * 13.0); 
			System.out.println("Valor total do pedido: " + valortotal);
			break;
			
		default:
			System.out.println("Escolha uma opção válida.");
		}
		
	}

}
