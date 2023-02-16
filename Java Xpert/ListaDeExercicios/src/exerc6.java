import java.util.Scanner;

public class exerc6 {

	public static void main(String[] args) {
		/*
		 * Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
		 * antecessor e seu sucessor.
		 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("----------ANTECESSOR E SUCESSOR-----------\n");
		
		System.out.println("Informe um numero inteiro: ");
		int num = entrada.nextInt();
		
		int antecessor = num - 1;
		int sucessor = num +1;
		
		System.out.println("O antecessor e " + antecessor + ", o sucessor e " + sucessor + ".");
		
		entrada.close();
	}

}
