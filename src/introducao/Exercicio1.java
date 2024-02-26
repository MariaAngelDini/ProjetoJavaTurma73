package introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario;
		float abono;
		float novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o seu Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Insira o seu Abono Salarial: ");
		abono = leia.nextFloat();
		
		leia.close();
		
		novosalario = salario + abono;
		
		System.out.println("Aqui está seu novo salário: " + novosalario);
	}

}
