import java.util.Scanner;

public class ejercicio2Unidad20 {
    /*20. Pedir un número entero positivo N. A continuación, introducir por teclado N números enteros. Mostrar 
    la media de los N números introducidos, el mayor y el menor.*/
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
    
        int num1;
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        double cont = 0;

        System.out.println("Dime un número entero positivo");
        num1 = in.nextInt();

        for(int i=1; i<=num1 ; i++){
            double num2;
            System.out.println("introduce " + i  + " numeros enteros ");
            num2 =in.nextDouble();
            cont = cont +num2;
            if(num2>max){
                max = num2 ;
            }
            if(num2<min){
                min = num2;
            }
        }

        System.out.println("La media de los numeros introducido es: " + cont / num1 );
        System.out.println("El número maximo introducido es: " + max + " El número minimo introducido es: " + min );

        in.close();
    }
    
}
