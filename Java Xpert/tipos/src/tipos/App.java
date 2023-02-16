package tipos;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe seu nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Boa noite, " + nome);

	}

}
