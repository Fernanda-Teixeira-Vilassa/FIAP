import java.util.Random;
import java.util.Scanner;

public class AdivinheQualEONumero {

	public static void main(String[] args) {
		/*
		 * Utilize a classe Random para gerar um número que ficará oculto para o
		 * usuário. Este número está entre 0 e 99.
		 * 
		 * Random rnd = new Random(); //Inicia Aleatório 
		 * int x = rnd.nextInt(100);  //Gera um número aleatório (0 – 99)
		 * 
		 * 1. Faça um laço de repetição que solicite ao usuário digitar um número; 2. O
		 * laço encerra quando o usuário acertar o número; 3. Se o número do usuário for
		 * menor que o oculto, escrever: “MAIOR”, se o número do usuário for maior que o
		 * oculto, escrever: “MENOR”.
		 */

		 int num;
		 
		 Scanner entrada = new Scanner(System.in);
		
		 Random rnd = new Random(); //Inicia Aleatório 
		 int x = rnd.nextInt(100);  //Gera um número aleatório (0 – 99)
		 //System.out.println(x);
	 		 
		 do {
			 System.out.println("----------------------------------------------");
			 System.out.println("----------ADIVINHE QUAL E O NUMERO?-----------");
			 System.out.println("----------------------------------------------");
			 System.out.println("Informe um numero entre 0 a 99: ");
			 num = entrada.nextInt();
			 
		 if(num > x) {
			 System.out.println("MENOR!\n");

			 
		 } else if (num < x) {
			 System.out.println("MAIOR!\n");

		 } else {
			 System.out.println("Voce acertou!!!");
		 }
		 
		 }while (num != x);

		
	}
}
		 
		

