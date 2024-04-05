import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class entregar3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3. Programa que lea un número positivo de un dígito por teclado y diga en letra a qué dígito corresponde
        //(uno, dos, tres, cuatro, …). Ejemplo: si se introduce el 1, se mostrará por pantalla el “uno”; si se introduce
        //el 11, se mostrará el mensaje “Error: no es un número de un dígito”
        
        System.out.println("Introduce un número positivo y te lo dire en letra que número es ");
        
        int numero;
        numero =sc.nextInt();

        switch (numero) {

             case 0:System.out.println(" Cero ");
                
                break;

            case 1:System.out.println(" Uno ");
                
                break;

             case 2:System.out.println(" Dos ");
                
                break;

             case 3:System.out.println(" Tres ");
                
                break;

             case 4:System.out.println(" Cuatro ");
                
                break;
            
             case 5:System.out.println(" Cinco ");
                
                break;

             case 6:System.out.println(" Seis ");
                
                break;
        
             case 7:System.out.println(" Siete ");
                
                break;

             case 8:System.out.println(" Ocho ");
                
                break;

             case 9:System.out.println(" Nueve ");
                
                break;    

            default:System.out.println("Error no es número de un digito");
                break;
        }

    }
}
