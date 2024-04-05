package OpenWebiners.estructurasdecontrol;

import java.util.Scanner;

public class ejercicioV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce un nota ");
        int nota = Integer.parseInt(sc.nextLine());

        switch (nota) {
            case 0,1,2,3,4:
                System.out.println(" Insuficiente ");
                
                break;
             case 5:
                System.out.println(" Suficiente ");
                
                break;
            case 6:
                System.out.println(" Bien ");
                
                break;
            case 7,8:
                System.out.println(" Notable ");
                
                break;
            case 9,10:
                System.out.println(" Sobresaliente ");
                
                break;        
        
            default:
                System.out.println(" Introduce una nota entre el 0 y el 10 ");
                break;
        }
        sc.close();
    }
    
}
