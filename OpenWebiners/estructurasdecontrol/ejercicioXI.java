package OpenWebiners.estructurasdecontrol;
/*
 * 11. Escribe un programa en Java que encuentre cuál es el mayor de 3 números usando sentencias if-else.
 */

import java.util.Scanner;

public class ejercicioXI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce el primer numero ");
        int numero1 = Integer.parseInt(sc.nextLine());
        System.out.println(" Introduce el segundo numero ");
        int numero2 = Integer.parseInt(sc.nextLine());
        System.out.println(" Introduce el tercer numero ");
        int numero3 = Integer.parseInt(sc.nextLine());

        if ((numero1>numero2) && (numero1>numero3)) {
            System.out.println(numero1 + " es el numero mayor ");     
        }else if ((numero2>numero1)&& (numero2>numero3)) {
            System.out.println(numero2 + " es el numero mayor ");
        }else{
            System.out.println(numero3 + " es el mayor ");
        }
    }
    
}
