package SegundaEvaluacionProgramacion.Ejercicio_POO.Ejercicio_2_Coche;

import java.util.Scanner;

public class TestCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche(); // Se llama al objeto Coche.

        Scanner sc = new Scanner(System.in);

        System.out.println(" Cuantos km/h quieres que acelere el coche ");
        int mas = Integer.parseInt(sc.nextLine());
        coche1.acelera(mas);    // Aqui se llama al metodo acelera.
        System.out.println(" Cuanto Km/h quieres que frene el coche ");
        int menos = Integer.parseInt(sc.nextLine());
        coche1.Frena(menos); // Aquí se llama la metodo frena.
        System.out.println(" La velocidad del coche es :" + coche1.getVelocidad() + " Km/h "); // Se llama al metodo velocidad actual.

    sc.close();
    }
}
