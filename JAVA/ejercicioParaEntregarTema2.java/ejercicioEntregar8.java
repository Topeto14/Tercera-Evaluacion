import java.util.Scanner;

public class ejercicioEntregar8 {
    public static void main(String[] args) {
        
        //8. Programa que imprima la tabla de multiplicar de cualquier número entre el 1 y el 10 introducido por teclado.

        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Introduce un número por teclado del 1 al 10 y te hare la tabla de multiplicar");
        numero =sc.nextInt();
    
        for (int i =1; i <= 10; i++) {
            System.out.println(" La multiplicación del número " + numero +" X " + i + " = " + numero * i );
            }
        
        }



    
    
}
