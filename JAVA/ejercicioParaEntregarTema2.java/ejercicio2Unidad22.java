import java.util.Scanner;
    /*22. Pedir un número entre 1 y 9999 y decir si es capicúa. */
public class ejercicio2Unidad22 {
    public static void main(String[] args) {
        int num;
        int milesimas;
        int centenas;
        int decenas;
        int unidades;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número entre 1 y 9999");
        num = in.nextInt();

        while (num<1 || num>9999) {
            System.out.println("Introduce un número entre 1 y 9999");
            num = in.nextInt();    
        }

        milesimas =num/1000;
        centenas = (num/100)%10;
        decenas = (num%100)/10;
        unidades = (num%10);
        
        if(num>=1 && num<=9){
            System.out.println("el numero introducido si es capicua");
        }else if((num>=1 && num<=9999) && (milesimas==unidades || centenas==decenas)){
            System.out.println(" el numero introducido es capicua ");
        }else if((num>=100 && num<=999) && (centenas==unidades)){
            System.out.println("el número introducido si es capicua ");
        }else if((num>=10 && num<=99) && (unidades==decenas)){
            System.out.println("El numero introducido es capicua");
        }else{
            System.out.println("el número introducido no es capicua");
        }
       
        in.close();
    }
}
