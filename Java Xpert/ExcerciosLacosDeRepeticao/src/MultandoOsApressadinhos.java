import java.util.Scanner;

public class MultandoOsApressadinhos {

	public static void main(String[] args) {
		/*
		 * Crie um programa Java que; após receber a velocidade máxima da via, ele
		 * comece a coletar a velocidade dos carros que passam.
		 * 
		 * Para cada carro que passar o programa deverá ser capaz de:
		 * 
		 * Multar caso desrespeitem a velocidade máxima conforme os parâmetros abaixo:
		 * 
		 * 1. Informe 50 reais se estiver até 10km/h acima; 
		 * 2. Informe 100 reais se estiver entre 11km/h e 30km/h acima; 
		 * 3. Informe 300 reais se estiver acima de 31km/h acima.
		 * 
		 * Gerar relatório ao final do processamento com:
		 * 
		 * A) Velocidade média dos veículos; 
		 * B) Total de multas em R$ 
		 * C) Total de multas aplicadas 
		 * D) Percentual de carros multados
		 */

		int opcao, totalVelocidade = 0, cont = 0, totalMultas = 0;
		float media, valorMultas = 0, multaAplicada = 0, percentual;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------");
		System.out.println("----------MULTANDO--OS--APRESSADINHOS-------------\n");
		
		System.out.println("Informe a velocidade maxima da via: ");
		int velocMax = entrada.nextInt();
		
		do {
			
		System.out.println("\nTem alguma velocidade a ser adicionada: 1-SIM ou 2-NAO\n ");
		opcao = entrada.nextInt();
		
		if(opcao == 1) {
		System.out.println("\nInforme a velocidade do carro: ");
		int velocidade = entrada.nextInt();
		
		//Dados para a media
		cont = cont + 1;
		totalVelocidade = totalVelocidade + velocidade; 
		
		int diferenca = velocidade - velocMax;
		
		if(diferenca <= 0) {
			System.out.println("\nNao havera multa!!");
			
		} else if(diferenca > 0) {
			totalMultas = totalMultas + 1;
			
			if(diferenca > 0 && diferenca < 11) {
				multaAplicada = 50;
				
				System.out.println("Multa de R$50,00.");
				
			} else if(diferenca > 10 && diferenca < 31) {
				multaAplicada = 100;
				
				System.out.println("Multa de R$100,00.");
				
			} else {
				multaAplicada = 300;
				
				System.out.println("Multa de R$300,00.");
			}
			
			valorMultas = valorMultas + multaAplicada;
			
		}
		
		} else {
			
			System.out.println("FIM\n");
		}
		
		percentual = (totalMultas / cont) * 100;
			
		} while(opcao == 1);
		
		
		media = totalVelocidade / cont;
		
		System.out.println("================RELATORIO FINAL=================\n");
		System.out.println("Velocidade media dos veiculos: " + media + ".");
		System.out.println("Total de multas em R$ " + valorMultas + ".");
		System.out.println("Total de multas aplicadas: " + totalMultas + ".");
		System.out.println("Percentual de carros multados: " + percentual + "%.");

}}
