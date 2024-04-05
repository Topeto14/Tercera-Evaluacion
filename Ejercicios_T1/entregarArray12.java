public class entregarArray12 {
    /*12. Crear una matriz “marco” de tamaño 8x6. Una matriz “marco” es aquella que todos sus elementos son 0 salvo los 
    de los bordes que deben ser 1. Mostrarla. */
    public static void main(String[] args) {
        int tabla[][] = new int [8][6];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if ((i==0) || (i==7) ) {
                    tabla[i][j] = 1;
                } else if ((j==0) || (j==5)) {
                    tabla[i][j] = 1 ;
                }else{
                    tabla[i][j]=0;                }
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");                
            }
            System.out.println();
        }

    }
}
