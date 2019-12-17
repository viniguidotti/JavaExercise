package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		// if(...) setenca; ou {}
		// while(...) setenca; ou {}
		// for (...; ...; ...) setenca; ou {}
		// do setenca; ou {} while(...)

		Scanner entrada = new Scanner(System.in);

		String texto = "";

		do {
			System.out.println("Voc� precisa falar as palavras m�gicas...");
			System.out.println("Quer sair?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado!");

		entrada.close();

	}

}