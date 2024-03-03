package collections;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();

		int opcao;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("---------- Menu ----------");
			System.out.println("1- Adicionar livro na pilha");
			System.out.println("2- Listar todos os livros");
			System.out.println("3- Retirar livro da pilha");
			System.out.println("0- Sair");

			System.out.println("Insira a opção desejada:");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Insira o nome do livro:");
				String livro = leia.next();
				pilha.push(livro);
				System.out.println("Livro adicionado à fila com sucesso.");
				break;
				
			case 2:
				if (pilha.empty()) {
					System.out.println("A pilha de livros está vazia.");
				}
				else {
					System.out.println("Livros na pilha:");
					for (String livros : pilha) {
						System.out.println(livros);
					}
				}
				break;
				
			case 3: 
				if (pilha.empty() ) {
					System.out.println("A pilha está vazia.");
				}
				else {
					System.out.println("Livro removido: " + pilha.pop());
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
		leia.close();
	}

}
