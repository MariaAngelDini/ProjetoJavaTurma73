package lacos_condicionais;

import java.util.Scanner;

public class Interativo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println("Insira um valor para X");
		x = leia.nextInt();
		
		System.out.println("Insira um valor para Y");
		y = leia.nextInt();
		leia.close();
		
		if (x > y) {
			System.out.println("X é maior que Y");
		}
		
		else if (x == y) {
			System.out.println("X é igual a Y");
		}
		
		else {
			System.out.println("X é menor que Y");
		}
	}

}
