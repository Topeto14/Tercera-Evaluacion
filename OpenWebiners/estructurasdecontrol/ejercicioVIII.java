package OpenWebiners.estructurasdecontrol;

import java.util.Scanner;

/**
 * Escribe un programa que acepte por teclado una cadena y muestre la cadena inversa.
 */

public class ejercicioVIII {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();

        String cadenaInvertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        System.out.println("Cadena invertida: " + cadenaInvertida);
        sc.close();
    }
}
    
