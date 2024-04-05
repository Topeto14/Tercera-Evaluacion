import java.util.Scanner;

public class ejercioEntregar9 {
    public static void main(String[] args) {

        //9. Crea un método que, dado un número entero pasado como parámetro, devuelva cuántos dígitos lo
        //forman. P.ej.: el número 54326 consta de 5 dígitos. Pista: cuántas veces se puede dividir entre 10.

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int contador = 1; 
        int numeroOriginal;
        System.out.println("Introduce un numero y te dire los digitos que tiene");
        numero =sc.nextInt();
        numeroOriginal = numero;
        while ((numero/10) > 0) {

            numero = (numero/10);
            contador++;
        }

        System.out.println("El número " + numeroOriginal + " tiene " + contador + " digitos ");

        
    }
}
