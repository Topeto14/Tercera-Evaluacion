import java.util.Arrays;
/*Ordenar matrices. Crea una matriz de enteros de dos dimensiones de 50x50 elementos, rellénala con números 
    aleatorios entre 1 y 500. A continuación, realiza dos funciones:
    a. ordenaFilas(matriz): que ordene la matriz por filas, cada fila de la matriz quedará ordenada de menor a 
    mayor. 
    b. ordenaColumnas(matriz): que ordene la matriz por columnas, cada columna quedará ordenada de 
    menor a mayor, independientemente de las demás. */

public class entregarArray17 {
    public static int generarNumeros (int min, int max){
        return (int) ((Math.random()*(max - min +1)+min));
    }

    public static void pintarMatriz(int matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ordenarFilas(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
        }
    }

    public static void ordenarColumnas(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            int columna [] = new int[matriz.length]; // se crea un array con la misma longitud que el numero de filas de la matriz.
            for (int j = 0; j < columna.length; j++) { // se crea otro bucle que recorre cada fila de la matriz.
                columna[j] = matriz[j][i]; // se agrega elementos correspondientes de la columna actual al array.     
            }
            Arrays.sort(columna); // se ordena la el array columnas
            for (int j = 0; j < columna.length; j++) { // se recorre cada fila de la matriz y asigna el elemento correspondiente. poniendo la j antes que la i
                matriz[j][i] = columna[j];
            }
        }
    }

    public static void main(String[] args) {
        int matriz [][] = new int[50][50];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = generarNumeros(1, 500);
            }
        }
        System.out.println(" Esta es la tabla original ");
        pintarMatriz(matriz);
        System.out.println();
        System.out.println(" Esta es la tabla ordenada por filas ");
        ordenarFilas(matriz);
        pintarMatriz(matriz);
        System.out.println();
        System.out.println(" Esta es la tabla ordenada por columnas ");
        ordenarColumnas(matriz);
        pintarMatriz(matriz);
    }
    
}
