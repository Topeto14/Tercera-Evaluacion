public class Maxmatrices {
    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }

    public static void pintarMatriz(int matriz[][]){
         for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }     
            System.out.println();
        }           
    }

    public static int minimoMatriz(int matriz[][]) {

        int minimo = 100000;
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                //Check min
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
        }
        return minimo;
    }    
    public static void main(String[] args) {
        int tabla[][] = new int [5][5];
        
       

        for(int i=0; i<tabla.length; i++){
            for(int j=0; j<tabla[0].length; j++){
                tabla[i][j]=generarNumero(10, 99);
            }     
        }  
        pintarMatriz(tabla); 
        System.out.println(minimoMatriz(tabla));  
    }
     

}
