import java.util.Scanner;

public class entregarArray13 {
    /*13. Crear una tabla bidimensional de tamaño 3x4 de números enteros (leídos desde teclado). Mostrar la matriz y la 
    suma de los valores de cada fila. */
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tabla[][]=new int[3][4];

        int sumafila = 0 ;
        
        try {
            
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.println(" Dime numeros enteros en la posicion " + (i)+ " , " + (j));
                tabla[i][j]= Integer.parseInt(teclado.nextLine());
                
            }
        }
        
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();
        
        for (int i = 0; i < tabla.length; i++) {
            sumafila = 0;
            for (int j = 0; j < tabla[0].length; j++) {
                sumafila = sumafila + tabla[i][j] ;
            }     
             System.out.println(" La suma de las fila " + i +  " es : " + sumafila);
        }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(" Debes de poner un numero entero ");
        }

        
          
              
    }
    
}
