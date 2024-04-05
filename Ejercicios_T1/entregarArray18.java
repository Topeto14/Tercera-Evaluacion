import java.util.Arrays;

public class entregarArray18 {
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
        int tabla[][] = new int[4][5];
        int tabla2[][] = new int[5][6];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] = generarNumeros(0, 9);
            }
        }
        pintarMatriz(tabla);
        System.out.println();
        
        int totalFila = 0 ;
        int totalFilas = 0 ;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                totalFila += tabla[i][j];
            }
            tabla[i][tabla[0].length-1] = totalFila;
            totalFilas += totalFila;
            totalFila =0; 
        }

        int totalcolumna = 0;
        int totalcolumnas = 0 ;
        for (int i = 0; i < tabla[0].length; i++) {
            for(int j=0; j<tabla.length-1; j++){
                totalcolumna += tabla[j][i];
            }
            totalcolumna +=totalcolumnas;
            tabla[tabla.length-1][i]=totalcolumna;
            totalcolumna = 0;
        }

        tabla[tabla.length-1][tabla[0].length-1]=totalFilas + totalcolumnas;
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }
    }
}
