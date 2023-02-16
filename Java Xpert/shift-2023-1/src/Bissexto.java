import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {
			 
		/*
		 * Desafio 2:
		 * 
		 * Faça um programa que escreva se um ano informado pelo usuário é bissexto ou
		 * não. Um ano é bissexto quando é (divisível por 400) ou é (divisível por 4 e
		 * não por 100).
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("-----------Ano Bisexto-----------------------");
		System.out.println("Informe o ano: ");
		
		int ano = entrada.nextInt();
		
		int resultado = ano % 400;
		
		if (resultado == 0) {
			System.out.println(ano + " é bissexto!");
		} else {
			System.out.println(ano + " não é bissexto!");
		}
		
		entrada.close();

	}

}
