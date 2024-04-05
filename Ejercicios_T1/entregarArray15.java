public class entregarArray15 {
    /*15. Crear dos matrices 3x3 de números enteros (generadas aleatoriamente), pintarlas, sumarlas y mostrar su suma. El 
    resultado será también una matriz (suma) donde cada elemento será la suma de los elementos de las otras 
    matrices en la misma posición. */
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

    public static void main(String[] args) {
        int tabla1 [][] = new int[3][3];
        int tabla2 [][] = new int[3][3];
        int suma [][] = new int[3][3];

        for (int i = 0; i < tabla1.length; i++) {
            for (int j = 0; j < tabla1[i].length; j++) {
                tabla1[i][j]= generarNumeros(1, 9);
                tabla2[i][j]= generarNumeros(1, 9);
                suma [i][j]=tabla1[i][j] + tabla2[i][j];
            }
        }

        System.out.println("Esta es la tabla 1 "); 
        pintarMatriz(tabla1);
        System.out.println();
        System.out.println("Esta es la tabla 2 ");
        pintarMatriz(tabla2);
        System.out.println();
        System.out.println("Esta es la tabla donde se suman la tabla 1 y 2 en la misma posicion ");
        pintarMatriz(suma);

    }
}
