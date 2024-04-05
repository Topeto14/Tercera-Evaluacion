import java.util.Scanner;

public class entregar1 {


    public static void main(String[] args) {
        
            //Ejercicios de condicionales
            //1. Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
            //los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros. Sería así:
            //public int mayor(int a, int b, int c) { … }
       
            Scanner sc = new Scanner(System.in);
            
            int a, b, c;
            

            System.out.println("Vas a introducir 3 números de los cuales te voy hallar el que es mayor");
            System.out.println("");
            System.out.println("Introduce el primer número");
            a = sc.nextInt();
            System.out.println("Introduce el segundo número");
            b = sc.nextInt();
            System.out.println("Introduce le tercer número");
            c =sc.nextInt();
    
            

            if(a>b && a>c) {
                System.out.println("El primer número es mayor que el segundo y el tercero");
            } else if (b>a && b>c) {
                System.out.println("El segundo número es mayor que el primero y el tercer número");
            } else {
                System.out.println("El tercer número es mayor que el primero y el segundo ");
            }

   }
   
}