package controle;

import java.util.Scanner;

public class Exercicio1_Controle {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num = 0;
		
		//entrada
		System.out.print("Digite o n�mero desejado: ");
		num = entrada.nextInt();
		
		//processamento
		if(num >= 0 && num <= 10) {
			System.out.print("O numero est� entre o 0 e o 10");
		} else {
			System.out.print("O n�mero est� fora do 0 e 10");
		}
		
		if(num %2 == 0) {
			System.out.print(" e o n�mero � par.");
		} else {
			System.out.print(" e o n�mero � �mpar.");
		}
		
	}

}
