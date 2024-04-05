import java.util.Scanner;
//17. Programa que lea un entero positivo introducido por el usuario y que muestre por pantalla todos sus 
//divisores

public class entregar2unidad17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        
        System.out.println("dime un numero que te voy a decir cuales son los divisores de ese numero");
        num = in.nextInt();
        System.out.println("Los divisores del " + num + " son :");
        for(int i=1; i<=num; i++ ){ //haremos un bucle para saber todos lo numero del 1 al introducido
            if(num % i ==0){ //aqui van a sacar todos los numeros que al dividir y el resto de 0 
                System.out.println(i); //aqui nos lo va imprimir

            }
        }
    }
}
