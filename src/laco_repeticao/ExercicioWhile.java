package laco_repeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {

		//leia varias idades, identifique quantas sao menores que 21 e quantas sao maiores que 50 e print
		//digitar um numero negativo para parar
		int idade;
		int menorque21 = 0;
		int maiorque50 = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a idade: (digite uma idade negativa para parar.)");
		idade = leia.nextInt();

		while (idade >= 0) {

			if (idade < 21) {
				menorque21++; 
			//menorque21 = menorque21 + 1;
			} else if (idade > 50) {
				maiorque50++;
			}

			System.out.println("Digite a idade: (digite uma idade negativa para parar.)");
			idade = leia.nextInt();

		}
		System.out.println("Quantidade de pessoas com menos de 21 anos:" + menorque21);
		System.out.println("Quantidade de pessoas com mais de 50 anos:" + maiorque50);

		leia.close();
	}

}
