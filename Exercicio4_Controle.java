package controle;

import java.util.*;

public class Exercicio4_Controle {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		//entra o numero
		System.out.println("Número: ");
		int num = entrada.nextInt();
		
		for (int i = 1; i < num; num--) {
			if(num %i != 0) {
				System.out.println("O número ");
			}
		}
		
		
	}
}
