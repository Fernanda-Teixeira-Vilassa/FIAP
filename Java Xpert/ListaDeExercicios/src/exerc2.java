
public class exerc2 {

	public static void main(String[] args) {
		// Fazer um programa que imprima a média aritmética dos números 8,9 e 7. 
		//A média dos números 4, 5 e 6. 
		//A soma das duas médias. 
		//A média das médias.

		System.out.println("Media Aritmetica entre 8, 9 e 7.");
		byte media1 = (8 + 9 + 7) / 3;
		System.out.println("Resultado: " + media1 + ".");
		System.out.println("--------------------------------\n");
		
		System.out.println("Media Aritmetica entre 4, 5 e 6.");
		byte media2 = (4 + 5 + 6) / 3;
		System.out.println("Resultado: " + media2 + ".");
		System.out.println("--------------------------------\n");
		
		System.out.println("Soma das medias");
		byte somaMedia = (byte) (media1 + media2);
		System.out.println("Resultado: " + somaMedia + ".");
		System.out.println("--------------------------------\n");
		
		System.out.println("Media das medias");
		byte mediaMed = (byte) (somaMedia /2);
		System.out.println("Resultado: " + mediaMed + ".");
		System.out.println("--------------------------------\n");
		
	}

}
