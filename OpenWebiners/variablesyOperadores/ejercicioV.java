

import java.util.Scanner;

/**
 *  Calcular la conversion de Euros a Dolares.
 */
public class ejercicioV {
    public static void main(String[] args) {
        double Euro = 0 ;
        double Dolar = 1.88 ;
        double conversion = 0 ; 
        Scanner sc = new Scanner(System.in);
        System.out.println(" Dime cuantos Euros te convierto en Dolares ");
        Euro = Integer.parseInt(sc.nextLine());

        conversion = Euro * Dolar ;
        System.out.println( Euro  + " Euros son " + conversion + " Dolares " );

        sc.close();
    }

    
}
