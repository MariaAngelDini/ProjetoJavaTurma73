package introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float salariobruto;
		float adicionalnoturno;
		float extras;
		float descontos;
		float salarioliquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira seu Salário bruto:");
		salariobruto = leia.nextFloat();
		
		System.out.println("Insira seu Adicional Noturno:");
		adicionalnoturno = leia.nextFloat();
		
		System.out.println("Insira suas Horas Extras:");
		extras = leia.nextFloat();
		
		System.out.println("Insira seus Descontos:");
		descontos = leia.nextFloat();
		
		leia.close();
		
		salarioliquido = (salariobruto + adicionalnoturno + extras) - descontos;
		
		System.out.println("Seu salário líquido é: " + salarioliquido);




	}

}
