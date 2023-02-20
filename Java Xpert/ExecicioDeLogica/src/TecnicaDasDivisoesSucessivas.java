
public class TecnicaDasDivisoesSucessivas {

	public static boolean main(long dividendo) {
		/*
		 * A técnica das divisões constantes, tenta determinar mais rapidamente possível
		 * se um número não é primo. Com essa técnica caso encontre um divisor exato o
		 * número não será primo.
		 */
		
		
		//Dividendo tem que se maior que 0
		if (dividendo <= 1) {
			return false;
		}
		
		//Testando todos os divisores até o dividendo, para vericar se é divisivel 
		for ( int divisor = 2; divisor < dividendo; divisor++) {
			if (dividendo % divisor == 0) {
				//Não é primo
				return false;
			}
		}
		//É primo
		return true;
	}

}
