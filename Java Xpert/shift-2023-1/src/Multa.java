import java.util.Scanner;

public class Multa {

	public static void main(String[] args) {
		/*
		 * Desafio 1:
		 * 
		 * Crie um programa Java que leia a velocidade de um carro e a velocidade máxima
		 * para a via:
		 * 
		 * 1. Informe 50 reais se estiver até 10km/h acima;
		 * 
		 * 2. Informe 100 reais se estiver entre 11km/h e 30km/h acima;
		 * 
		 * 3. Informe 300 reais se estiver acima de 31km/h acima.
		 */

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("---------Simulador de Multa-------------------");
		System.out.println("Qual a velocidade do carro? ");
		
		byte velocidade = entrada.nextByte();
		
		System.out.println("Qual e a velocidade maxima na via? ");
		
		byte velocidadeMax = entrada.nextByte();
				
		int diferenca = velocidade - velocidadeMax;
				
		if (diferenca > 0 && diferenca < 11) {
			System.out.println("Sua multa e de R$50,00.");
		} else if (diferenca > 10 && diferenca < 31) {
			System.out.println("Sua multa e de R$100,00.");
		} else if (diferenca > 30) {
			System.out.println("Sua multa e de R$300,00.");
		} else {
			System.out.println("Nao havera multa.");
		}
		
		entrada.close();
	}

}
