import java.sql.Date;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
		 * dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o
		 * mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
		 */
		
		final short DiasAnos = 365;
		final short DiasMes = 30;
		short dias;
		short meses;
		short anos;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a sua idade.");
		System.out.print("Anos: ");
		anos = entrada.nextShort();
		
		System.out.print("Meses: ");
		meses = entrada.nextShort();
		
		System.out.print("Dias: ");
		dias = entrada.nextShort();
		
		dias += (anos * DiasAnos) + (meses * DiasMes);
		
		System.out.println("\nA sua idade em dias eh: " + dias + ".");
	}

}
