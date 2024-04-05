import java.util.Scanner;

public class dividirDosnumerosSegundoNo0 {

    public static void main(String[] args) {

    double num1, num2;
    double resultado;
    Scanner sc = new Scanner(System.in);

    System.out.println(" Te voy a dividir dos numeros ");
    System.out.println(" Introduce el primer numero ");
    num1 = sc.nextDouble();

    System.out.println(" Introduce el segundo numero ");
    num2 = sc.nextDouble();

    if (num2==0){
    System.out.println("No se puede hacer la division");

     } else {resultado = num1/num2 ;
     System.out.println("el resultado de la division es " + resultado );
     }


    
}
}