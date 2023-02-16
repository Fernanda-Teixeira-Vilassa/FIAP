package tipos;

public class Tipo {

	public static void main(String[] args) {
		
		/*
		 * boolean correto = false; 
		 * System.out.println(correto);
		 */
		
	{
		//-128 até 127 = 2^8
		byte idade = 40;
		byte minimo = Byte.MIN_VALUE;
		byte maximo = Byte.MAX_VALUE;
		System.out.println("Byte cabe de " + minimo + " a " + maximo);
		
		byte outro = (byte) (maximo + 129);
		System.out.println("Outro = " + outro);
	}
	
	{
		//2^16 -32768 até 32767
		short metro = 15000;
		short minimo = Short.MIN_VALUE;
		short maximo = Short.MAX_VALUE;
		System.out.println("Short cabe de " + minimo + " a " + maximo);
	}

	{
		//2^32 -2.147.483.648  até 2.147.483.647
		int numeroDoPedido = 300000;
		int minimo = Integer.MIN_VALUE;
		int maximo = Integer.MAX_VALUE;
		System.out.println("Integer cabe de " + minimo + " a " + maximo);
	}
	
	{
		//2^64 -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807
		long identificador = 30000000000L;
		long minimo = Long.MIN_VALUE;
		long maximo = Long.MAX_VALUE;
		System.out.println("Long cabe de " + minimo + " a " + maximo);
	}
}
}
