public class ejercicioEntregar11 {
    //11. Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n = 
    //número de líneas, que se pida por teclado.
    //    *
    //   **
    //  ***
    //*****

    public static void main(String[] args) {
        int num =4;

        for(int i=1; i<=num; i++ ){
           for (int j = num; j >= num-i; j--){
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.print("");
            }
            System.out.println();
        }

    }
}     

    

