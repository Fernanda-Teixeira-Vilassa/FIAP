import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de
		 * um usuário, calcule a quantidade de salários mínimos esse usuário ganha e
		 * imprima o resultado. (1SM=R$1.302,00)
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("---------------CALCULADORA DE SALARIOS----------------\n");
		
		System.out.println("Informe o salario minimo atual: ");
		float salMinimo = entrada.nextFloat();
		
		System.out.println("Informe o seu salario atual: ");
		float salAtual = entrada.nextFloat();
		
		float quantSal = salAtual / salMinimo;
		
		System.out.println("A quantidade de salários mínimos esse usuário ganha: " + quantSal + ".");
		
		entrada.close();
	}

}
