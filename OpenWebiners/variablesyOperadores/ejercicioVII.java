

import java.util.Scanner;

public class ejercicioVII {
    public static void main(String[] args) {
        double suma = 0 ;
        double resta = 0 ;
        double multiplicacion = 0 ;
        double division = 0 ;
        double resto = 0 ;

        Scanner sc = new Scanner(System.in);

        System.out.println(" Dime dos números con los que te voy hacer unas operaciones ");
        System.out.println(" Introduce el primer número ");
        double numero1 = Integer.parseInt(sc.nextLine());
        System.out.println(" Introduce el segundo número ");
        double numero2 = Integer.parseInt(sc.nextLine());
        suma = numero1 + numero2 ;
        resta = numero1 - numero2 ;
        multiplicacion = numero1 * numero2 ;
        division = numero1 / numero2 ;
        resto = numero1 % numero2 ;
        System.out.println(" La suma de " + numero1 + " + " + numero2 + " es " + suma );
        System.out.println(" La resta de " + numero1 + " - " + numero2 + " es " + resta );
        System.out.println(" La multip`licación de " + numero1 + " x " + numero2 + " es " + multiplicacion );
        System.out.println(" La división de " + numero1 + " / " + numero2 + " es " + division );
        System.out.println(" el resto de dividir " + numero1 + " / " + numero2 + " es " + resto );
        sc.close();
    }
    
}
