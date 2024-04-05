import java.util.Scanner;

public class ejercicio2unidad24 {
    /*24. Búsqueda binaria. El usuario piensa un número, y el programa debe averiguarlo. Pide al usuario que 
    piense un número entre el 1 y el 100. El programa mostrará un número por pantalla y preguntará al 
    usuario si el número que ha pensado es menor, igual o mayor al número mostrado. Este proceso lo 
    repetirá hasta encontrar el número que ha pensado el usuario. Al finalizar el proceso, mostrará el número 
    de intentos probados hasta encontrar el número */
      public static int generarTirada(){
        int tirada;
        tirada =(int) (Math.random()*(100-1)) + 1;
        return tirada;
    }
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

    
           
        for(int i=1; i<=100; i++){
            System.out.println();
        }
        
        
       
    }
        
       
       
        
        
        
        
}
       

        

        

    

