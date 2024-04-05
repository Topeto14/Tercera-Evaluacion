import java.util.Scanner;

public class anoBisiesto {

    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
            num = sc.nextInt();

            System.out.println("Introduce un año para comprobar si es bisiesto");

        if ((num%4==0) && (num%100 !=0)) {
            System.out.println("Es año bisiesto");
        
        } else if ((num%4==0) && (num%400 ==0)) {
            System.out.println("Es año bisiesto");

        } else{
            System.out.println(" El año no es bisiesto");

        } 





    }
}
