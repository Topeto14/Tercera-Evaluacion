import java.util.Arrays;
import java.util.Scanner;

public class entregarArray3 {

    /*3. Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 1 y 300 
    y mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado (debes controlar 
    que se introduce un numero correcto), estos deben guardarse en un nuevo array. Por ejemplo, en un array de 10 
    posiciones e indicamos mostrar los números acabados en 5, podría salir 155, 25, etc. Cuando llene el segundo 
    array finalizamos. */
     

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
        Scanner in = new Scanner(System.in);

        int tamanioarray;
        int acabadigito;
        int contador = 0 ;
        System.out.println(" Dime el tamaño del array introduciendo un numero ");
            tamanioarray= Integer.parseInt(in.nextLine()); 
        
        int tabla[] = new int [tamanioarray];
        int tabladigitos[] = new int [tamanioarray];
        int resultado[] = new int[tamanioarray];

        for (int i=0; i<tabla.length; i++){ 
            tabla[i] = generarNumeros(1, 300);    
        }
        System.out.println(" Estos son los numeros aleatorios que tiene el array ");
        pintarMatriz(tabla);

        System.out.println(" Dime el digito con el que quieres que acabe para guardarlo ");
            acabadigito = Integer.parseInt(in.nextLine());

        for(int i=0; i<tabla.length; i++){
            if(tabla[i]%10==acabadigito){
                tabladigitos[contador] = tabla[i];
                contador++;
                
            }
        } 
         
        for(int i=0; i<tabladigitos.length; i++){
            resultado[i] = tabladigitos[i];
        }
        System.out.println(" Estos son los numero que terminan en " + acabadigito + " : ");
        for(int i=0; i<contador; i++){
            System.out.print(resultado[i] +  " ");
        }   
    }   
}
