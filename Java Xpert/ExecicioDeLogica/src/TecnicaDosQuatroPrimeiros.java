
public class TecnicaDosQuatroPrimeiros {

	public static boolean main(String[] args) {
        int numero = 0;
        
		//É divisivel por 2,3,5,7? Caso seja falso para todos ele é primo.
        if (numero < 2) {
        	return false;
        }
        if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
        	return true;
        }	
        return numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0 && numero % 7 != 0;


	}

}
