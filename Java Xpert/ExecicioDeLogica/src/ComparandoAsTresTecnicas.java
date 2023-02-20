import java.time.Duration;
import java.time.Instant;

import javax.swing.JOptionPane;

public class ComparandoAsTresTecnicas {

	public static void main(String[] args) {
        long numero = Long.parseLong(

                JOptionPane.showInputDialog(
                        """
                                    Informe a quantidade de números - de zero até ele - que deseja verificar se é primo.
                                                            
                                    Por exemplo; ao digitar o número 5, o resultado será:
                                                            
                                    [ 2 ] [ 3 ] [ 5 ]
                                                        
                                """
                )
        );


        byte tecnica = Byte.parseByte(

                JOptionPane.showInputDialog(
                        """
                                                        
                                    Qual a técnica que deseja utilizar?
                                                    
                                    1 - Divisões Sucessivas.
                                    2 - Crivo de Eratóstenes.
                                                
                                """
                )
        );


        switch (tecnica) {
            case 1 -> tecnicaUm(numero);
            case 2 -> tecnicaDois(numero);
            default -> System.out.println("Aceitamos somente números 1 ou 2");
        }

    }


    public static void tecnicaUm(long numero) {
        {
            long contador = 0;
            Instant inicio = Instant.now();
            while (contador <= numero) {
                if (TecnicaDasDivisoesSucessivas.main(contador)) {
                    System.out.print("[ " + contador + " ]");
                }
                contador++;
            }
            System.out.println("\nTempo Total: " + Duration.between(inicio, Instant.now()).toMillis());
        }
    }


    public static void tecnicaDois(long numero) {
        long contador = 0;
        Instant inicio = Instant.now();
        while (contador <= numero) {
            if (TecnicaDoCrivoDeEratostenes.main(contador)) {
                System.out.print("[ " + contador + " ]");
            }
            contador++;
        }
        System.out.println("\nTempo Total: " + Duration.between(inicio, Instant.now()).toMillis());


	}

}
