import java.util.Scanner;

public class entregarArray_8 {
    /*8. Genera aleatoriamente una tabla de 10 elementos numéricos enteros, guardalos en una array. Luego pide por 
    teclado una posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos. */
    public static int generarNumeros (int min, int max){
        return (int) ((Math.random()*(max - min +1)+min));
    }
    public static void pintarMatriz(int matriz[]) {
        for(int i=0; i<matriz.length; i++) {
                System.out.print(matriz[i] + " ");
            }
            System.out.println();
        }
    public static void pintarMatrizQuitandoPosicion(int matriz[]) { // en esta funcion vamos a pintar los numeros sin una posicion.
        for(int i=0; i<matriz.length-1; i++) { // Para que no se vea en la terminal la ultima posicion le quitamos un puesto a los elementos 
                System.out.print(matriz[i] + " ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tabla[]=new int [10];
        int posicionEliminar;
        for(int i=0; i<tabla.length; i++){
            tabla[i]=generarNumeros(1, 20);
        }
        pintarMatriz(tabla);

        System.out.println(" Dime una posición del 0 al 9 para eliminar ");
        posicionEliminar = Integer.parseInt(teclado.nextLine());
        //* En este for vamos eliminar la posición */
        for(int i=posicionEliminar; i<9; i++){
            tabla[i] = tabla[i+1];
        }
        System.out.println( " Esta es la nueva tabla eliminando la posición " + posicionEliminar);
        pintarMatrizQuitandoPosicion(tabla);
    }
    
}
