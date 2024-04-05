package SegundaEvaluacionProgramacion.Ejercicio_POO.Ejercicio_4_Finanza;

import java.util.Scanner;

public class TestFinanzas {
    public static void main(String[] args) {
        Finanzas f1 = new Finanzas();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Dime cuantos Dolares quieres que te convierta en Euros ");
        double dolar = Double.parseDouble(sc.nextLine());
        System.out.println(dolar + " dolar es " + f1.dolaresToEuros(dolar) + " Euros");
        System.out.println(" Dime cuantos Euros quieres que te convierta en Dolares ");
        double euros = Double.parseDouble(sc.nextLine());
        System.out.println(euros + " Euros son " + f1.eurosToDolares(euros) + " Dolares ");

        sc.close();
    }
}
