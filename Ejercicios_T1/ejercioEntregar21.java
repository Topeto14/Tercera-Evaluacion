import java.util.Scanner;

public class ejercioEntregar21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int centenas, decenas, unidades;
        int resultado;

        System.out.println("introduce un número y te lo volvere capicua");
        numero =sc.nextInt();

        centenas = numero / 100;
        decenas = (numero /10)%10;
        unidades = numero % 10;

        System.out.println(centenas+ " Centenas " );
        System.out.println(decenas + " Decenas " );
        System.out.println(unidades + " Unidades ");

        resultado = (unidades*100) + (decenas*10) + centenas;
        System.out.println( resultado + "Este es el número al reves");



    }
    
}
