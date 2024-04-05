
public class ejercicioIX {
    /**
     * 9. Escribe un programa en Java que intercambie el valor de dos variables.
     * @param args
     */
    public static void main(String[] args) {
        int a = 1 ;
        int b = 2 ;

        System.out.println(" El valor de a es " + a + " el valor de b es " + b );

        int temp = a ;
        a = b ;
        b = temp ;
        System.out.println( " Despues del intercambio el valor de a es " + a + " el valor de b es " + b );

    }
    
}
