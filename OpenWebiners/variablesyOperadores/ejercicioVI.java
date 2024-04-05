

import java.util.Scanner;

/**
 * Calcular si un numero es par o impar 
 */

public class ejercicioVI {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero = 0 ;
        System.out.println(" Introduce un numero que te dire si es par o impar ");
        numero = Integer.parseInt(sc.nextLine());

        if (numero % 2 == 0) {
            System.out.println(" Es un numero par ");
        } else{
            System.out.println(" Es un numero impar ");
        }
        
        sc.close();
    }

}
