package OpenWebiners.estructurasdecontrol;

import java.util.Scanner;

/**
    9. Escribe un programa en Java que compruebe si un carácter es una vocal o no.
 */
public class ejercicioIX {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un carácter: ");
        String letra = sc.next();
        if (letra.length() != 1) {
            System.out.println("Por favor, introduce solo un carácter.");
        } else {
            char ch = letra.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " es una vocal.");
            } else {
                System.out.println(ch + " no es una vocal.");
            }
        }
        sc.close();
    }
   
}
    

