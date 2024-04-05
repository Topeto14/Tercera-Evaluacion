import java.util.Scanner;

public class entregar5Bucles {
    public static void main(String[] args) {

        //5. Programa que pida al usuario un número repetidamente hasta que el número introducido esté entre 1 y 10.
        Scanner sc = new Scanner(System.in);

            int numero;
            
        do {
            System.out.print("Te voy a pedir números hasta que aciertes dentro del rango que quiero que introduzca : ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 10);

    }
}
