import java.util.Scanner;

public class Elogio {

	public static void main(String[] args) {
		/*
		 * Selecione a opção desejada: 
		 * 1-Elogio profissional 
		 * 2-Elogio físico 
		 * 3-Elogio pessoal
		 */
		
		System.out.println("-----------ELOGIO----------------------");
		System.out.println("Agora informe o nome da pessoa que deseja elogiar: ");

		Scanner entrada = new Scanner(System.in);
		
		String nome = entrada.nextLine();
		
		System.out.println("Selecione a opção desejada: ");
		System.out.println("1-Elogio profissional");
		System.out.println("2-Elogio físico");
		System.out.println("3-Elogio pessoal");
		
		byte opcao = entrada.nextByte();
		
		switch (opcao) {

		case 1:

		    System.out.println("Voce é uma pessoa atenciosa!");

		break;

		case 2:

			System.out.println("Voce é uma pessoa alta!");

		break;

		case 3:

			System.out.println("Voce é uma pessoa inteligente!");
			
		break;

		default:

			System.out.println("A opções são 1, 2 ou 3.");

		}
		
	}

}
