import java.util.Arrays;



public class entregarArray2 {
    /*. Crea una función que reciba como parámetro un array de 10 enteros, debe devolver el mismo array donde se 
    hayan intercambiado el primer elemento y el último elemento. */

  
    public static void main(String[] args) {
        
        int numeros [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numeros));

        int primer = numeros[0];
    
        numeros[0]= numeros[numeros.length-1];
        numeros[numeros.length-1]= primer;
        System.out.println(" Este es el mismo array cambiando el primero por el ultimo ");
        System.out.println(Arrays.toString(numeros));

       
    }
}       
