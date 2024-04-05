public class entregarArray14 {
    /*14. Crear una matriz 5x3 de números enteros (aleatorios) y mostrar el menor, el mayor y la media de los elementos */

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
    
    public static int numeroMayor(int [][] tabla){
        int numeroMayor = -1;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j]>= numeroMayor) {
                    numeroMayor= tabla[i][j];
                }
            }
        }
        return numeroMayor;
    }
    
    public static int numeroMenor(int [][] tabla){
        int numeroMenor = 999999;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j]<= numeroMenor) {
                    numeroMenor= tabla[i][j];
                }
            }
        }
        return numeroMenor;
    }

    public static double mediamatriz(int tabla[][]){
        double sumanumeros = 0 ;
        double cont = 0 ;
        double media = 0 ;
        for(int i = 0; i< tabla.length; i++){
            for(int j = 0; j<tabla[j].length; j++){
                sumanumeros += tabla[i][j];
                cont++;
            }    
        }
        media = sumanumeros/cont;
        return media;   

    }

    public static void main(String[] args) {
        int tabla [][] = new int [5][3];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j]=generarNumeros(10, 99);
            }      
        }  
        
        System.out.println();
        pintarMatriz(tabla);
        System.out.println();
        System.out.println(" El numero Mayor de la tabla es :" + numeroMayor(tabla));
        System.out.println();
        System.out.println(" El numero Menor de la tabla es : " + numeroMenor(tabla));
        System.out.println();
        System.out.println(" La media es : " + mediamatriz(tabla));
             
    }
}
