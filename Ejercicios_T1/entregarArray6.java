public class entregarArray6 {
    /*6. Generar 10 números enteros aleatorios. Debemos mostrarlos en el siguiente orden: el primero, el último, el 
    segundo, el penúltimo, el tercero, etc… Pista: primero los guardas en un array y luego lo recorres como indica */
    
    public static int generarNumeros (int min, int max){
        return (int) ((Math.random()*(max - min +1)+min));
    }
    public static void pintarMatriz(int matriz[]) {
        for(int i=0; i<matriz.length; i++) {
                System.out.print(matriz[i] + " ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int tabla[]= new int[10];
        int tabla2[]=new int[10];

        int cont1 = 0;
        int cont2 = tabla.length-1;

        for(int i=0; i<tabla.length; i++){
          tabla[i]=generarNumeros(1, 10);  
        }
        
        pintarMatriz(tabla);    
       
        for(int i=0; i<tabla.length; i+=2){
            tabla2[i]=tabla[cont1];             
            tabla2[i+1]=tabla[cont2];     
            cont1++;
            cont2--;    
        }
        
        pintarMatriz(tabla2);       
    }
    
}
