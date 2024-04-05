import java.util.Scanner;

public class entregar2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //2. Programa que lea un número por teclado e indique si es múltiplo de 2, 3, 5 o 7.

        int numero;

        System.out.println("Introduce un numero y te dire si es multiplo de 2, 3, 5 o 7 ");
        numero =sc.nextInt();

        if ((numero % 2) == 0) {
            System.out.println("Este número es multiplo de 2");
        } else if((numero % 3) == 0) {
            System.out.println("Este número es multiplo de 3 ");
        } else if ((numero % 5) == 0) {
            System.out.println("Este número es múltiplo de 5");
        } else if ((numero % 7) == 0) {
            System.out.println("Este númreo es múltiplo de 7");
        }


    }
}
