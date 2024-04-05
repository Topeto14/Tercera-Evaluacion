public class entregarArray_10 {
    /*10. Realiza una función que devuelva un array con una combinación de la Lotería Primitiva (6 números entre 1 y 49). 
    La particularidad es que los números no deben estar repetidos. */
    public static int generarNumeros (int min, int max){
        return (int) ((Math.random()*(max - min +1)+min));
    }
    public static void pintarMatriz(int matriz[]) {
        for(int i=0; i<matriz.length; i++) {
                System.out.print(matriz[i] + " ");
            }
            System.out.println();
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
            loteria[i]=generarNumeros(1, 49);
        }
        pintarMatriz(loteria);

        for (int i = 0; i < loteria.length; i++) {
            
           /** while (numeroRepetido = true) {
                
            }*/
        }
    }
    
}
