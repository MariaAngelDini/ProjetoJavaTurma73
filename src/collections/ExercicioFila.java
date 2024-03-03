package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();

		System.out.println("---------- Menu ----------");
		System.out.println("1- Adicionar cliente na fila");
		System.out.println("2- Listar todos os clientes");
		System.out.println("3- Retirar cliente da fila");

		Scanner leia = new Scanner(System.in);

		int opcao;

		System.out.println("\nPor favor, digite a opção desejada:");
		opcao = leia.nextInt();

		String nome;
		
		switch (opcao) {


		case 1:
			System.out.println("\nInsira o nome do cliente:");
			nome = leia.next();
			fila.add(nome);
			System.out.println("\nPor favor, digite a opção desejada:");
			opcao = leia.nextInt();
			
			
		case 2:
			System.out.println("\nNomes na fila:");
			System.out.println(fila);
			break;
			
		case 3: System.out.println("\nInsira o nome a ser removido da fila:");
				nome = leia.next();
				System.out.println(fila.remove(nome));
		
		}

	}

}
