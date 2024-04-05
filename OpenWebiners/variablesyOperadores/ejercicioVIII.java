
import java.util.Scanner;

public class ejercicioVIII {
    /**
     * 8. Escribe un programa en Java que calcule la media de 3 números que se hayan leído desde el teclado y la muestre por consola.
 
        
     *      * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Te voy hacer la media de tres notas que me digas ");
        System.out.println(" Dime el primer número ");
        double numero1 = Integer.parseInt(sc.nextLine());
        System.out.println(" Dime el segundo número ");
        double numero2 = Integer.parseInt(sc.nextLine());
        System.out.println(" Dime el tercer número ");
        double numero3 = Integer.parseInt(sc.nextLine());

        double media = (numero1 + numero2 + numero3)/3 ;

        System.out.println(" La media de " + numero1 + " , " + numero2 + " , " + numero3 + " es: " + media );
        sc.close();

    }
    
}
