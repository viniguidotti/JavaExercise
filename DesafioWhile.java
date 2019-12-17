package controle;

import java.util.*;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			System.out.print("Informe a nota (ou -1 p/sair): ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else if(nota != -1) {
				System.out.println("Nota Inv�lida!!!!! ;D");
			}
			
		}
		
		//Calculo da M�dia
		
		double media = total / quantidadeDeNotas;
		System.out.println("M�dia = " + media);
		System.out.println("Quantidade de notas: " + quantidadeDeNotas);
		
		//saida
		entrada.close();
	}

}
