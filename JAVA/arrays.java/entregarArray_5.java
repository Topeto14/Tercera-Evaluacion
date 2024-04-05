import java.util.Scanner;

public class entregarArray_5 {
     /*5.Leer 10 números enteros y a continuación mostrar la media de los números introducidos, el mayor valor y el
        menor valor. Usar un array para almacenar los valores y sacar toda la información en una sola iteración del array.
        Si puedes mejóralo implementando una función para cada tarea (media, mayor, menor), pasando el array. */
        public static int elnumeroMayor(int[] numeros){
            int numeroMayor = -1;
           for(int i=0; i<numeros.length; i++){
                if(numeros[i] >= numeroMayor ){
                    numeroMayor = numeros[i];    
                }
            }
            return numeroMayor;
        }
        public static int elnumeroMenor(int[] numeros){
            int numeroMenor = 999999;
            for(int i=0; i<numeros.length; i++){
                if(numeros[i] < numeroMenor){
                    numeroMenor = numeros[i];
                }
            }
            return numeroMenor;
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numeros[] = new int [10];
        int suma = 0 ;
        int media = 0 ;

        
        for(int i=0; i<numeros.length; i++){
            System.out.println(" Dime numeros enteros " + (i+1));
            numeros[i]= Integer.parseInt(in.nextLine());
        }

        for(int i=0; i<numeros.length; i++){
            suma = suma + numeros[i];
        }        
            media = suma / numeros.length ;

        System.out.println("la suma de los numeros es " + suma);
        System.out.println(" La media es " + suma / numeros.length);
        System.out.println("El numero mayor es " + elnumeroMayor(numeros) );
        System.out.println(" El numero menor es " + elnumeroMenor(numeros) );
    }
    
}
