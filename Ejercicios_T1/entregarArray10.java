import java.util.Arrays;

public class entregarArray10 {
    /*10. Realiza una función que devuelva un array con una combinación de la Lotería Primitiva (6 números entre 1 y 49). 
    La particularidad es que los números no deben estar repetidos. */
    public static int generarNumeros (int min, int max){
        return (int) ((Math.random()*(max - min +1)+min));
    }
 
    public static boolean numeroRepetido(int numeros, int matriz[]){
        for (int i = 0; i < matriz.length; i++) {
            if (numeros==matriz[i]) { 
                return true;     
            }
        }
        return false;  
    }
    public static void main(String[] args) {
        int loteria[]= new int[6];

        for (int i = 0; i < loteria.length; i++) {
            int numero;
            do { numero = generarNumeros(1, 49);
                
            } while (numeroRepetido(numero, loteria));
            loteria[i]=numero;

        }
        System.out.println(Arrays.toString(loteria));
    }

    
}
