public class entregarArray11 {
    /*11. Crear una tabla bidimensional de tamaño 5x5 y rellenarla de forma que los elementos de la diagonal principal 
    sean 1 y el resto 0. Mostrarla. */
    
  
    public static void main(String[] args) {
        int tabla[][] = new int [5][5];
        
        for(int i=0; i<tabla.length; i++){
            for(int j=0; j<tabla[i].length; j++){ 
                if (i == j) {
                    tabla[i][j] = 1;
                } else{
                    tabla[i][j] = 0;
                }       
            }   
        } 

        for(int i=0; i<tabla.length; i++){
           for(int j=0; j<tabla[i].length; j++){
               System.out.print(tabla[i][j] + " ");
           }     
           System.out.println();
       }   
        
    }   
}  