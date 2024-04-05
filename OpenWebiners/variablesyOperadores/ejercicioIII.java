

import java.util.Scanner;

public class ejercicioIII {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int base = 0 ;
        int altura = 0 ;
        int area = 0 ;
        int perimetro = 0 ;

        System.out.println(" Te voy a calcular el perimetro y el area de un rectangulo ");
        System.out.println(" Necesito que me des la base y la altura ");
        System.out.println(" Dime la base del rectangulo ");
        base = Integer.parseInt(sc.nextLine());
        System.out.println(" Dime la altura del rectangulo ");
        altura = Integer.parseInt(sc.nextLine());

        area = base * altura ;
        perimetro = (2 * base) + (2 * altura) ;

        System.out.println(" El area del rectangulo es " + area );
        System.out.println(" El perimetro del rectangulo es " + perimetro );

        sc.close();

    }

    
}