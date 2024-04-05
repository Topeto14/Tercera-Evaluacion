import java.util.Scanner;

public class ejercicioRepetitivos12 {
    public static void main(String[] args) {
        
        //Ejercicio 12
        //Realizar un programa que pida el número de filas a mostrar y comience por la mayor fila
        //mostrando tantos asteriscos como la fila actual hasta llegar a cero.

        int numero;
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce un numero para que te lo enseñe con asteriscos hasta llegar a cero");
        numero =sc.nextInt();

        for (int i=numero; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
             System.out.println();
        }
        





    }
}
