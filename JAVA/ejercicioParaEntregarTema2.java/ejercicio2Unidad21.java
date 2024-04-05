import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class ejercicio2Unidad21 {
    public static void main(String[] args) {
        int num;
        int centenas;
        int decenas;
        int unidades;

        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero entre 1 y 999 que te lo mostrare al reves ");
        num = in.nextInt();

        while(num<1 || num>999){
            System.out.println("El numero introducido no esta entre los parametros de 1 - 999");

            System.out.println("Dime un numero entre 1 y 999 que te lo mostrare al reves ");
            num = in.nextInt();
        }

        centenas = num /100;
        decenas = (num%100)/10;
        unidades= num % 10;

        if(num>=1 && num<=9){
            System.out.println(" El inverso de este " + num + " es " + num);     
        }else if(num>=10 && num<=99){
            System.out.println("El inverso de " + num + " es " + unidades + decenas );
        }else{
            System.out.println("El inverso de " + num + " es " + unidades  + decenas + centenas );
        }

    
       

        in.close();
        
    }
}
