public class entregarArray16 {
    /*16. Crea una matriz de 3x6 números enteros aleatorios no repetidos. */
    public static int generarNumeros(int min, int max){
        return (int)((Math.random()*(max-min+1)+min));
    }
    public static void pintarMatriz(int matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean numeroRepetido(int numero, int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (numero==matriz[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int tabla[][] = new int[3][6];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                int numero;
                do {numero=generarNumeros(10, 27);
                    
                } while (numeroRepetido(numero, tabla));
                    tabla[i][j]=numero;
            }
          
        }
        pintarMatriz(tabla);
    }
}

