import java.util.Scanner;


public class ejercicioIntro4 {
    public static void main(String[] args) {
        //Leer el teclado
        Scanner sc= new Scanner(System.in);

        //Ejercicio 4
    //Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius. 
    //Recordar que la fórmula para la conversión es:
    // C = (F-32)*5/9

    double F, C;
    
    //Te pido que introduzcas los grados Fahrenheit para calculartelo a grados Celsius
    System.out.println("Introduce los grados Fahrenheit para que te lo convierta en grados Celsius");
    F =sc.nextDouble();

    //Pondre la formula para pasar de grados Fahrenheit a grados Celsius
    C =(F-32) * 5/9 ;

    //Te dare la conversion de grados Fahrenheit a grados Celsius
    System.out.println("Los grados Fahrenheit que has introducido son " + C + " grados Celsius");


        
    }
}
