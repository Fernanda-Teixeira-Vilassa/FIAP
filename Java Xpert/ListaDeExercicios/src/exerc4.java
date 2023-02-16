import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		/*
		 * Escrever um algoritmo que lê: 
		 * - a porcentagem do IPI a ser acrescido no valor das peças 
		 * - o código da peça 1, valor unitário da peça 1, quantidade de peças 1 
		 * - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
		 * O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
		 * Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
		 */
		
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("---------------CALCULADORA--------------------\n");
			
			System.out.println("Informe o porcentagem do IPI a ser acrescido no valor das pecas: ");
			float ipi = entrada.nextFloat();
			
			System.out.println("---------------DADOS DA PECA 1--------------------\n");
			System.out.println("Informe o codigo da peca 1: ");
			String cod1 = entrada.nextLine();
			
			System.out.println("Informe o valor unitário da peca 1: ");
			float valor1 = entrada.nextFloat();
			
			System.out.println("Informe a quantidade da peca 1: ");
			int quant1 = entrada.nextInt();
			System.out.println("------------------------------------------------\n");
			
			System.out.println("---------------DADOS DA PECA 2--------------------\n");
			System.out.println("Informe o codigo da peca 2: ");
			String cod2 = entrada.nextLine();
			
			System.out.println("Informe o valor unitário da peca 2: ");
			float valor2 = entrada.nextFloat();
			
			System.out.println("Informe a quantidade da peca 2: ");
			int quant2 = entrada.nextInt();
			System.out.println("------------------------------------------------\n");
			
			float total = (float) ((valor1*quant1 + valor2*quant2)*(ipi/100 + 1));
			
			System.out.println("O resultado e " + total + ".");
	
			entrada.close();
	}
	}


