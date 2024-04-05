import java.util.Arrays;

public class arraydel1al100 {
    /*Crea un array que tenga dentro todos los numeros del 1 al 100 */
    /*Crear un array de int de 50 elementos y llamalos pares */
    /*Crear un array de int de 50 elementos y llamalos pares */
    /*Rellenar el array "" */
    public static void main(String[] args) {
        
        int num[]= new int[100];
        int pares[]= new int[50];
        int impares[]= new int[50];

        for(int i=0; i<num.length; i++){
            num[i]=i+1;
            System.out.println(i);

        }
        
        for(int i=0; i<num.length; i++){
         System.out.println(num[i]);
        } 

         int contadorpar =0;
         int contadorimpares=0;

        for(int i=0; i<num.length; i++){
            if(num[i]%2==0){
                pares[contadorpar]=num[i];
                contadorpar++;
            }
            if(num[i]%2!=0){
                impares[contadorimpares]=num[i];
                contadorimpares++;
            }
            
        }
        System.out.println("Impares");
        System.out.println(Arrays.toString(impares));
        System.out.println("Pares");
        System.out.println(Arrays.toString(pares));
        

    }


}


    
    

