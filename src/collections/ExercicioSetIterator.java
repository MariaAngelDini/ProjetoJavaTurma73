package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSetIterator {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();

		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Insira 10 números inteiros diferentes");
		
		for(int contador = 0; contador < 10; contador++) {
			numero = leia.nextInt();
		}
		System.out.println("Números exibidos com o iterator:");
		
		
		Iterator<Integer> i = numeros.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
