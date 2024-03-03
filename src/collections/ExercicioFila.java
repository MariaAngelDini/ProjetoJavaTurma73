package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		int opcao;
		
		do {

		System.out.println("---------- Menu ----------");
		System.out.println("1- Adicionar cliente na fila");
		System.out.println("2- Listar todos os clientes");
		System.out.println("3- Retirar cliente da fila");
		System.out.println("0- Sair");

		Scanner leia = new Scanner(System.in);

		System.out.println("\nPor favor, digite a opção desejada:");
		opcao = leia.nextInt();

		String nome;
		
		switch (opcao) {
		
		case 1:
			System.out.println("\nInsira o nome do cliente:");
			nome = leia.next();
			fila.offer(nome);
            System.out.println("Cliente adicionado à fila com sucesso.");
			break;
		
			
		case 2:
			if (fila.isEmpty()) {
				System.out.println("A fila está vazia.");
			}
			else {
				System.out.println("Clientes na fila:");
				for (String cliente : fila) {
					System.out.println(cliente);
				}
			}
			break;
			
		 case 3:
             if (fila.isEmpty()) {
                 System.out.println("A fila está vazia.");
             } else {
                 String clienteChamado = fila.poll();
                 System.out.println("Cliente chamado: " + clienteChamado);
             }
             break;
             
		 case 0: 
			 System.out.println("Programa encerrado.");
			 break;
			 
		default:
			System.out.println("Opção inválida.");
		}
		
		}
		while (opcao != 0);
	
	}

}
