package controle;

import java.util.Scanner;

public class Exericio3_Controle {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota1 = 0;
		double nota2 = 0;
		double media = 0;

		// entrada
		System.out.print("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();

		System.out.print("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();

		// processamento
		media = (nota1 + nota2) / 2;

		//saida
		
		System.out.print("A nota final do aluno foi = " + media);
			System.out.print(" e");
		
		if (media >= 7) {
			System.out.println(" foi aprovado");
		}
		if (media <= 7 && media >= 4) {
			System.out.println(" ficou de recuperação");
		} else {
			System.out.println(" foi reprovado");
		}
	}

}
