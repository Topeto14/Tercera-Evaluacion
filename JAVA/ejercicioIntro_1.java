import java.util.Scanner;


public class ejercicioIntro_1 {
    public static void main(String[] args) {
       // Ejercicio 1
       //Escribir un programa que pregunte al usuario su nombre, y luego lo salude
       String nombre;

       // leer el escaner para poder leer el teclado 
       Scanner sc= new Scanner(System.in);

       //Se pide el nombre
       System.out.println("Por favor dime tu nombre");

       //Devuelve el nombre
       nombre = sc.nextLine();

       //Te lee el nombre que has escrito y te manda un saludo
       System.out.println( nombre  +  " Bienvenid@ al mundo de la programacion");


    }
}
