import java.util.Scanner;

public class ejercicioEntregar9 {
    public static void main(String[] args) {
        
        //9. Crea un método que, dado un número entero pasado como parámetro, devuelva cuántos dígitos lo
        //forman. P.ej.: el número 54326 consta de 5 dígitos. Pista: cuántas veces se puede dividir entre 10.
        
        java.util.Scanner sc = new Scanner(System.in);

        int numero;
        int unidades, decenas, centenas ;
        int resultado;

        System.out.println(" Introduce un número de 3 digitos y te dire cuantos numeros lo forman ");
        numero =sc.nextInt();

        centenas = numero /10 ;
        decenas =(centenas  /10) % 0 ;
        unidades = decenas  /10;

        resultado = centenas + decenas + unidades; 

        System.out.println(" El número " + numero + " tiene " + resultado );



    




    }
}
