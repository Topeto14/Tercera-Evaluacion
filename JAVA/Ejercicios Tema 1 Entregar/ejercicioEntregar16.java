import java.util.Scanner; 

public class ejercicioEntregar16 {
    public static void main(String[] args) {
        
        //* 16. Escriba un programa para calcular el área y el volumen de un cilindro. Para ello declare una constante 
        //  que guarde el valor de Pi. Declare, también, variables para el diámetro y la altura del cilindro. Suponga 
        //  para el ejemplo que el cilindro tiene un diámetro de 15,5cm y una altura de 42,4cm.

            final double PI;
            double area, volumen, diametro, altura, radio;

            Scanner sc = new Scanner(System.in);

            System.out.println("Te voy a calcular el área y el volumen de un cilindro");

            System.out.println("Introduce el diametro");
            diametro =sc.nextDouble();

            System.out.println("Introduce la altura");
            altura =sc.nextDouble();

            radio = diametro / 2;
            area =2 * Math.PI * radio * (altura + radio);
            System.out.println("El area de la base del cilindro sera " + area );

            volumen = Math.PI * Math.pow(radio, 2) *altura ;
            System.out.println("El volumen del cilindro sera " + volumen );


    }
    
}
