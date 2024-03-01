package collections;

import java.util.Stack;

public class ExemploPilha {

	public static void main(String[] args) {
		// ultimo a entrar primeiro a sair

		// criando a collection de pilha
		Stack<String> pilha = new Stack<String>();

		// ao inves de .add é .push para adcionar a "lista"
		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");

		System.out.println("\nElementos da Pilha: " + pilha);
		
		//retira o ultimo elemento 
		System.out.println("\nRetirar elemento: " + pilha.pop());

		System.out.println("\nElementos da Pilha: " + pilha);

	}

}
