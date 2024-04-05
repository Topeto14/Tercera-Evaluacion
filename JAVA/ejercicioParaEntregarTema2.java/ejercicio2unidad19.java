import java.util.Scanner;
    /*9. Programa que, dado un número entero positivo introducido por teclado, visualice por pantalla todos los 
    números primos menores que él. Utiliza la función del ejercicio anterior. Ejemplo:*/
public class ejercicio2unidad19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Dime un numero: ");
        num = in.nextInt();
        
        while(num<=0){
            System.out.println("eres un cabeza de verga meteme un numero positivo");
            System.out.println("Dime un numero positivo hdp");
            num = in.nextInt();
        }
        
        System.out.print("Los primos menores de " + num + " son: ");

        for(int i=1; i<num; i++){
            if (esPrimo(i)) {
                System.out.print(i + ",");
            }
            
        }
        in.close();
    }

    public static boolean esPrimo(int num) {
       //devolver true si es num es primo, y false si num no es primo.
       boolean esPrimoOno = false;
       // num 7
       int cont=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){           
                cont= cont + 1;
            }
        }
        if(cont==2 || num==1){
            esPrimoOno = true; 
        } else {
            esPrimoOno = false; 
        }

       return esPrimoOno;
    }
}
