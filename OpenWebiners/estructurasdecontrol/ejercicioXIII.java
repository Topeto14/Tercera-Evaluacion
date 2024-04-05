package OpenWebiners.estructurasdecontrol;
/*
 * 13. Escribe un programa en Java que permita calcular el n-ésimo término de la sucesión de Fibonacci. En dicha sucesión se da que:
- f(0) = 0;
- f(1) = 1;
- f(n) = f(n-1) + f(n-2), con n>=2.
 
 */

import java.util.Scanner;

public class ejercicioXIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0 ; 
        int b = 1 ;
        int c = 0 ;

        System.out.println(" Dime el numero de veces que quieres que te haga fibonacci ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print( a + " , ");
                c = a + b ;
                a = b ;
                b = c ;       
            } else {
                System.out.print(a);
            }            
        }

        System.out.println( " . ");
       
       sc.close(); 
    }
    
}
