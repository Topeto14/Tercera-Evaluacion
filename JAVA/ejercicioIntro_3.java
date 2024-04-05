import java.util.Scanner;

public class ejercicioIntro_3 {
    public static void main(String[] args) {

       // Ejercicio 3
       //Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.

       Scanner sc= new Scanner(System.in);

       double num1, num2;
       double suma, resta, division, multiplicacion ;
        //Te saldra un enunciado indicandote el problema que te voy a dar y que introduzcas el primer numero 
        System.out.println("Vas introducir dos numeros para que te calcule la suma, resta, division y multiplicacion de ambos");
        System.out.println("Introduce el primer numero");
        //se guardara el primer numero que introduzcas
        num1 =sc.nextDouble();
        // Te pedire el segundo numero
        System.out.println("Introduce el segundo numero");
        //Se guardara el segundo numero que te pida 
        num2 =sc.nextDouble();
        //La formula de todos los problemas que te voy a solucionar 
        suma = num1 + num2;
        resta = num1 - num2;
        division = num1 / num2;
        multiplicacion = num1 * num2;
        // Te dara la solucion a todos los problemas que te pedi en el principio
        System.out.println("La suma de tus numeros es " + suma + " La resta de tus numeros es " + resta + " La division de tus numeros es " + division + " la multiplicacion de tus numeros es " + multiplicacion );



        
    }
}
