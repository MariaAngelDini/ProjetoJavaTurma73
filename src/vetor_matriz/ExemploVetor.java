package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		String cachorros[] = new String[3];
		
		Scanner leia = new Scanner(System.in);
		
		int indice;
		
		//guarda os nomes
		for(indice = 0; indice < 3; indice++) {
			
			//sysout e aperta ctrl + espaço
			System.out.println("Digite o " + (indice + 1)+ "º nome");
			cachorros[indice] = leia.nextLine();
		}
		
		//cachorros.length = 3 (caso nao saibamos o tamanho do vetor)
		
		//lista os nomes
		for (indice = 0; indice < cachorros.length; indice++) {
			System.out.println("cachorro [" + (indice + 1) + "]: " + cachorros[indice]);
		}
		
		System.out.println("Quantidade:" + cachorros.length);
	}
}