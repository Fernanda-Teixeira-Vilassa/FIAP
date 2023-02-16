import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		// Informar um saldo e imprimir o saldo com reajuste de 1%
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o saldo: ");
		float saldo = entrada.nextFloat();
		
		float saldoReajustado = (float) (saldo*1.01); 
		
		System.out.println("\n");
		System.out.println("Saldo com reajuste de 1%: " + saldoReajustado + ".");

		entrada.close();
	}

}
