import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		/*
		 * Para identificar se um número é primo ou não, precisamos conhecer quais são
		 * os divisores desse número. Caso esse número tenha exatamente dois divisores:
		 * 1 e ele mesmo, ele é primo; caso contrário, não é primo. Um número é chamado
		 * de primo quando possui exatamente dois divisores, 1 e ele mesmo.
		 * 
		 * Desafio: Criar um programa que receba um número e seja capaz de calcular se o
		 * número é primo.
		 * 
		 * Entretanto mostrarei para vocês três técnicas para se calcular o número
		 * primo.
		 */
		
	
		
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("----------------------------------------------------------");
		 System.out.println("----------------ESTE NUMERO E PRIMO?----------------------");
		 System.out.println("----------------------------------------------------------\n");
		 
		 System.out.println("Informe um numero: ");
		 int num = entrada.nextInt();
		 
			  boolean primo = true;  
			  
		      for (int i = 2; i <= (num / 2); i++){
		  
		        if (num % i == 0) {
		          primo = false;
		          break;
		        }
		      }
		       
		      if(primo){
		        System.out.println("O número informado é primo.");
		      }
		      else{
		        System.out.println("O número informado não é primo.");
		      }
		 entrada.close(); 
	}
	}


