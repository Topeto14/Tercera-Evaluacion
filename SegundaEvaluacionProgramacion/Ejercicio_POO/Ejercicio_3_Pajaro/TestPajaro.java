package SegundaEvaluacionProgramacion.Ejercicio_POO.Ejercicio_3_Pajaro;

import java.util.Scanner;

public class TestPajaro {
    public static void main(String[] args) {
        Pajaro p1 = new Pajaro();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Dime la edad del pajaro ");
        int edad = Integer.parseInt(sc.nextLine());
        p1.setedad(edad);
        p1.printedad();
        System.out.println(" Dime el color del pajaro ");
        String color = sc.nextLine();
        p1.setcolor(color);
        p1.printcolor();
        p1.printedad();
        p1.printcolor();

    }
}
