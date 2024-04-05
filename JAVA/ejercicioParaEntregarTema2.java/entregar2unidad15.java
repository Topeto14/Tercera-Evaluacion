import java.util.Scanner;
public class entregar2unidad15 {
    //15. Programa que lea números hasta que le den el cero, y que diga cuál ha sido el mayor y cuál el menor de 
    //los números introducidos (sin tener en cuenta el cero).

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numero ;
        int nummax=Integer.MIN_VALUE;
        int nummin=Integer.MAX_VALUE;
        System.out.println("Dime un numero");
        numero = in.nextInt();
    

        while (numero!=0) {
            System.out.println("te dire cual es el maximo y el minimo de los numeros que has introducido cuando metas 0");
            
            if(numero>nummax){
                nummax=numero;
            }
            if (numero<nummin) {
                nummin=numero;
            }
            System.out.println("Introduce otro numero");
            numero =in.nextInt();
        }

        in.close();
        System.out.println("el mayor introducido es " + nummax);
        System.out.println("el menor introducido es "+ nummin);
    }
}
