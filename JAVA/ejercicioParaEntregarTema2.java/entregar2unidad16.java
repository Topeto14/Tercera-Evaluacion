import java.util.Scanner;
public class entregar2unidad16 {
    //16. Programa que lea por teclado una serie de números enteros hasta que introduzca el -1 y obtenga su 
    //media. Deberá mostrarla por pantalla.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num;
        int suma=0;
        int contador=0;

        System.out.println("Dime numeros");
        num =in.nextInt();
        while (num!=-1) {
            suma = num + suma; //aqui va sumando los numeros 
            contador++; //aqui va contando las veces que introduzco un numero
            System.out.println("introduce otro numero");
            num = in.nextInt();
        }

        System.out.println("El contador es " + contador);
        System.out.println("La suma de los numeros son " + suma );
        System.out.println("la media es " + (suma / contador)   );

    }
}
