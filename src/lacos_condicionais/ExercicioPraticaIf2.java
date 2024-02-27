package lacos_condicionais;

import java.util.Scanner;

public class ExercicioPraticaIf2 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean vez;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		nome = leia.next();
			
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		
		System.out.println("É sua primeira vez doando sangue? (true-sim/ false-não))");
		vez = leia.nextBoolean();
		
		leia.close();
		
//		idade precisa ser entre 18 e 69 e a primeira vez
		
		if (idade >= 18 && idade <= 69 && vez == true ) {
			System.out.println("Parabéns, " + nome + ", você foi aprovado(a) para ser doador(a) de sangue!");
		}
		else {
			System.out.println("Que pena, " + nome + ", você não foi aprovado(a) para ser doador(a) de orgãos. ");
		}

	}

}
