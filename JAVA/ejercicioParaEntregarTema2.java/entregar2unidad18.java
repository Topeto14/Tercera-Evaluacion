import java.util.Scanner;

public class entregar2unidad18 {
    //18. Diseña un método que indique si un número entero pasado como parámetro es o no un número primo 
    //(devuelve un boolean). Un número primo es aquel que tiene por divisores el 1 y el propio número, 
    //únicamente.
    public static void main(String[] args) {
        int num;
        int cont=0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero que te voy a decir si es primo o no es primo");
        num =in.nextInt();

        for(int i=1; i<=num; i++){
            if(num % i == 0){
                cont = cont + 1;
            }
        }

        if (cont == 2) {
            System.out.println(true); // es primo
        } else {
            System.out.println(false); //no es primo
        }
   
    }
}
