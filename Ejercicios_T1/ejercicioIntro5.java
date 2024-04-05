import java.util.Scanner;


public class ejercicioIntro5 {
    public static void main(String[] args) {
       //Leer el teclado
        Scanner sc= new Scanner(System.in);

        //Ejercicio 5
        //Calcular la media de tres números pedidos por teclado

        double num1, num2, num3;
        double media;
        //Se pedira los tres numeros y se mantendra guardado
        System.out.println("Te pedire tres numeros para calcularte la media de ellos ");
        System.out.println("Introduce el primer numero");
        num1 =sc.nextDouble();
        System.out.println(" Introduce el segundo numero ");
        num2 =sc.nextDouble();
        System.out.println("Introduce el tercer numero");
        num3 =sc.nextDouble();
        //Con este problema se sumara los numeros y se dividira entre 3
        media = ((num1 + num2 + num3) / 3);
        //Te dara el resultado de las medias introducidas
        System.out.println("La media de tus numeros que has introducido es " + media );





        
        
    }
}
