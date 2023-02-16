package tipos;

import java.time.Year;
import java.util.Scanner;

public class CalculadoraIdade {

	public static void main(String[] args) {
		int anoAtual = 2023;
				
		System.out.println("---------------Calculadora de Idade---------------");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu Ano de Nascimento: ");
		int anoNasc = entrada.nextInt();
		
		int idade = (anoAtual - anoNasc);
		System.out.println("Voce tem ou farah " + idade + " anos este ano.");
		
		//Outra forma de fazer
		System.out.println("Sua idade deve ser: " + (Year.now().minusYears(anoNasc)));
	}
}