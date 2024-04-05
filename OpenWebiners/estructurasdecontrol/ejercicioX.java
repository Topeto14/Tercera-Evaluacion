package OpenWebiners.estructurasdecontrol;

import java.util.Scanner;

/**
 * 10. Escribe un programa en Java que comprueba si un año es bisiesto o no. Recuerda que los años bisiestos son aquellos que son divisibles entre 4 pero que no son divisibles entre 100, o que son divisibles entre 400.
 */

public class ejercicioX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce un año ");
        int anio = Integer.parseInt(sc.nextLine());

        if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0))) { 
            System.out.println(" Es un año bisiesto ");
        } else {
            System.out.println(" No es un año bisiesto ");
        }

        
    }
    
}
