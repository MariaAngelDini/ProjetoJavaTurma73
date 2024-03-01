package collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {

		// criando a colection set
		Set<String> setFrutas = new HashSet<String>();

		// Adiciona algumas frutas na Colection Set
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		
		System.out.println("\nDados da Collection: " + setFrutas);

		// For Each
		// variavel que representa cada itemm da set
		for (String fruta : setFrutas ) {
		// hashCode() é a posição do item 
			System.out.println("A posição de " + fruta + " é : " + fruta.hashCode());
			
		}
	}

}
