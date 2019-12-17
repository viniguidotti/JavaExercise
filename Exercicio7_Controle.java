package controle;

import java.util.Scanner;

public class Exercicio7_Controle {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0;

		do {
			System.out.println("Digite um número: ");
			num = entrada.nextInt();
			num += num;
			System.out.println(num);
		} while (num > 0);
		entrada.close();
	}

}
