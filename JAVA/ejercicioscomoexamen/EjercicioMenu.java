/**
 * EjercicioMenu
 */
import java.util.Scanner;

public class EjercicioMenu {

    public static int sumarDigitos(int numero){

        int suma = 0; 

        while (numero != 0) {
            
            suma = suma + (numero % 10);
            numero = numero / 10;

        }

        return suma;


    }
    public static void main(String[] args) {
      
        /*OPCIÓN 1
        Menú
        Realiza un programa que pida un número por teclado. Luego muestra un menú con las
        siguientes opciones:
            1. Muestra la suma de cada uno de sus dígitos
            2. Que diga si es primo o no
            3. La longitud de una circunferencia cuyo radio fuera ese número
            4. Salir
        Para cada una de las opciones deberás llamar a una función que calcule lo que se pide y
        devuelva el resultado. */

        int numero = 0;
        int opcion = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        numero = Integer.parseInt(sc.nextLine());

        while (opcion != 4){

            System.out.println("---- MENU -----\n");
            System.out.println("1. Muestra la suma de cada uno de sus dígitos");
            System.out.println("2. Que diga si es primo o no");
            System.out.println("3. La longitud de una circunferencia cuyo radio fuera ese número");
            System.out.println("4. Salir");
            System.out.println("");

            System.out.println("Elija un opción: ");
            opcion = Integer.parseInt(sc.nextLine());


            switch (opcion) {
                case 1:

                    System.out.println("");
                    System.out.println(sumarDigitos(numero));
                    
                    break;

                case 2:
                    
                    break;


                case 3:
                    
                    break;

                case 4:
                    
                    break;
            
                default:

                    System.out.println("Error, al introducir la opción");

                    break;
            }

        }
    
    
     




        sc.close();

    }

}