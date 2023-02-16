import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		/** * Uma ONG resolveu prestar um serviço bem diferente: ela oferece vans para buscar 
		 * pessoas com qualquer tipo de dificuldade de locomoção para poderem votar. 
		 * * Para evitar problemas no momento do embarque, você foi convidado a 
		 * criar um programa que valide a idade dos passageiros: 
		 * Caso tenham 16 anos ou menos, não podem votar (e nem embarcar). 
		 * * Caso tenham entre 16 anos e 18 incompletos ou mais de 65 anos, 
		 * podem optar por votar ou não. 
		 * * Caso tenham entre 18 e 65 anos incompletos, devem votar obrigatoriamente. 
		 * * Crie um programa que receba a idade dos passageiros em potencial e 
		 * indique se podem embarcar e votar. */
		
		
		System.out.println("---------------Verificação de Passageiros---------------");

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = entrada.nextInt();
		
		if (idade > 15) {
			if(idade > 15 && idade < 18) {
			System.out.println("Seu embarque é opcional!");
			
		} else if (idade > 18 && idade < 64) {
			System.out.println("Seu embarque é obrigatório!");
			
		} else if (idade > 64 ){
			System.out.println("Seu embarque é opcional!");
		}
		} else {
			System.out.println("Seu embarque não é permitido!");
		}
		entrada.close();
	}

}
