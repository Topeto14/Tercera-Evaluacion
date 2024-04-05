import java.util.Scanner;
    //14. Programa que lea dos números positivos e imprima por pantalla todos los números pares que estén entre 
    //los dos números dados. También debe indicar cuántos números pares hay en ese intervalo.
public class ejercicio2Unidad14 {
   
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        int contador=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer numero positivo");
        numero1 = Integer.parseInt(sc.nextLine());

        System.out.println("Dime el segundo numero positivo");
        numero2 = sc.nextInt(); 

        for(int i=numero1+2; i<numero2; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }else {
                contador++;
            System.out.println("Este es el numero de veces que hay de numeros pare entre"+ numero1
            + " y "+ numero2 + " = " + contador);
            }
           
            

        }


    }

}