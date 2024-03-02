package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioArrayList2 {

	public static void main(String[] args) {
		
		//algoritimo que cria um arraylist com 10 valores inteiros inicializados
		
		List<Integer> numeros = new ArrayList<Integer>(); 
		
//		numeros.add(2);
//		numeros.add(5);
//		numeros.add(1);
//		numeros.add(3);
//		numeros.add(4);
//		numeros.add(9);
//		numeros.add(7);
//		numeros.add(8);
//		numeros.add(10);
//		numeros.add(6);
		
		//insere numeros de 1 a 10 usando o contador
		for (int contador = 1; contador <= 10; contador++) {
			numeros.add(contador);
		}
//		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		//lê o numero a ser procurado na lista
		System.out.println("Digite o número a ser encontrado:");
		numero = leia.nextInt();
		
		//metodo que procura um objeto e retorna o indice dele (posição)
		int indice = indexOf(numeros);
		
		//condicional para mostrar o numero caso ele seja encontrado
		if(numero <= 10) {
			System.out.println("O número " + numero + " está no indice " + indice );
		}
		//caso nao seja encontrado, retorna essa mensagem
		else {
			System.out.println("O número " + numero + " não foi encontrado.");
		}
	}

	private static int indexOf(List<Integer> numeros) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}


