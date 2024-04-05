package OpenWebiners.estructurasdecontrol;
/*
 * 12. Escribe un programa en Java que pinte una pirámide con asteriscos. El número de pisos debe introducido a través del teclado.
 */

import java.util.Scanner;

public class ejercicioXII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduzca el numero de pisos de la piramide");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n  ; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
