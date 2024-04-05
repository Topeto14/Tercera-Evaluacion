import java.util.Scanner;
public class entregarArray_7 {
     /*7. Crear un programa que lea por teclado una tabla de 5 números enteros y la desplace una posición hacia la
    derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. Igual que el
    anterior, pero desplazando N posiciones (N es un número introducido por el usuario). */
     /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }
     /**
     * Función para pintar por consola los valores de una matriz de enteros
     * @param matriz
     *      */
    public static void pintarMatriz(int matriz[]) {
        for(int i=0; i<matriz.length; i++) {
                System.out.print(matriz[i] + " ");
            }
            System.out.println();
        }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tabla[] = new int [5];

        for (int i=0; i<tabla.length; i++){
            tabla[i]= generarNumero(1, 9); //se genera un numero aleatorio de numeros para que se introduzca en las 5 casillas del array
        }
        pintarMatriz(tabla); //Se pinta la matriz con la funcion que tenemos arriba.

        //Aqui le vamos a sumar una posición.
        int ultimo = tabla[4]; //guardo el ultimo numero que es la posicion 4 del array
        for(int i=3; i>=0; i--){ //que empieze por el array 3 y acabe en el 0
            tabla[i+1]=tabla[i] ;   //en la matriz se le suma una posicion de la matriz indicada 
        }
        tabla[0]= ultimo; //desplazamos el ultimo numero que guardamos a la posicion [0]
        System.out.println(" La tabla desplazada una posición hacia la derecha ");

        for(int i=0; i <tabla.length; i++){
            System.out.print(tabla[i] + " "); // imprimimos la tabla con el desplazamiento hacia la derecha.
        }

        int numerodesplazamiento=0; 
        System.out.println();
        System.out.println(" Dime el numero de veces que quieras que se desplazen los numeros ");
        numerodesplazamiento = Integer.parseInt(in.nextLine()); //pedimos por teclado el numero de desplazamientos que vamos hacer 
        for(int i = 0 ; i<numerodesplazamiento; i++){} // Hacemos un bucle y que se pare en el numero de desplazamiento que pedimos.
                ultimo = tabla[4]; //guardo el ultimo numero que es la posicion 4 del array
            for(int j=3; j>=0; j--){ //que empieze por el array 3 y acabe en el 1
                tabla[j+1]=tabla[j] ; //
            }
        tabla[0] = ultimo;
        
        System.out.println("La tabla se desplazara " + numerodesplazamiento + " posiciones ");
           for(int i=0; i <tabla.length; i++){
            System.out.print(tabla[i] + " "); //se imprime la tabla con el numero de desplazamientos que le hemos pedido.
        }
    }
    
}
