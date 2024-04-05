import java.util.Scanner;

public class ejercicioIntNum6 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        //Ejercicio 6
        //Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas
        //horas y minutos corresponde.
        //Por ejemplo: 1000 minutos son 16 horas y 40 minutos

        int horas, minutos;
        int num;
    
        System.out.println(" Introduceme una cantidad de minutos para que te diga cuantas horas y minutos son ");
        num = sc.nextInt();
        


        horas = num / 60;
        minutos = num % 60;

        System.out.println(" La cantidad que has introducido " + num + " son " + horas + " y " + minutos + " minutos ");

        
    }

}
