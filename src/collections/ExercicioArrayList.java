package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioArrayList {

	public static void main(String[] args) {
		//algoritimo que pede 5 cores, lê e armazena na arraylist
		
		//cria a array list "cores"
		List<String> cores = new ArrayList<String>();

		String cor;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 5 cores:");
		
		//laço para ler a cor 5 vezes
		for (int contador = 0; contador < 5; contador++) {
			cor = leia.next();
			
			//metodo para adicionar a cor ao arraylist cores
			cores.add(cor);
		}

		//mostra as cores que foram adicionadas
		System.out.println("Cores adicionadas:");
		System.out.println(cores);
		
		System.out.println("\nCores em ordem crescente:");
		
		//metodo para ordenar as cores em ordem crescente
		Collections.sort(cores);
		System.out.println(cores);
	
	}

}
