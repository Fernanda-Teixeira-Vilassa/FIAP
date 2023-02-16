package tipos;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
	
		/*
		 * float resultado = 5 / 2;
		 * 
		 * System.out.println("Resultado: " + resultado);
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o numero A: ");
		float a = sc.nextFloat();
		
		System.out.println("Informe o numero A: ");
		float b = sc.nextFloat();
		
		float resultado = a / b;
		
		 System.out.println("Resultado: " + resultado);
			
	}

}
