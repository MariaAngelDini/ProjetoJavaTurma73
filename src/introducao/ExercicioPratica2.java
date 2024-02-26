package introducao;

import java.util.Scanner;

public class ExercicioPratica2 {

	public static void main(String[] args) {
		
		int tempoemseg;
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira o tempo do evento:");
		tempoemseg = leia.nextInt();
		leia.close();
				
		int horas = tempoemseg / 3600;
		int minutos = (tempoemseg % 3600) / 60;
		int segundos = tempoemseg % 60;
		
		// %02d significa a quantidade de casas a mostrar.
		System.out.printf("Tempo de duração: %02d:%02d:%02d", horas, minutos, segundos );
	}

}
