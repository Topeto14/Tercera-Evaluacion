package OpenWebiners.estructurasdecontrol;
/*
 * 14. Implementa un programa en Java que determine si un número introducido por teclado es primo o no. Recuerda que:
- Un número es primo cuando sus únicos divisores son 1 y él mismo.
- Para un número primo `p`, hay que buscar divisores que sean menores o iguales que `p/2`.
 */

import java.util.Scanner;

public class ejercicioXIV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int contador = 0 ;
        System.out.println(" Introduce un número para saber si es primo o no ");
        int numero = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0)   {
                contador++;
            } 
        }
        if (contador > 2 ) {
            System.out.println(" El " + numero + " No es un número primo ");
        } else {
            System.out.println(" El " + numero + " es un número primo ");
        }
       sc.close(); 
    }
    
}
