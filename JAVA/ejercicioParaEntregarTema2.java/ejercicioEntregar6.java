

public class ejercicioEntregar6 {
    public static void main(String[] args) {
        //6. Programa que sume los 100 primeros números enteros impares.

        int suma = 0;
        int contador = 0;
        int i = 1;
        while (contador < 100) {
            if (i % 2 == 1) {
                suma += i;
                contador++;
            }
            i++;

        }
    System.out.println(" La suma de los primeros 100 números impares es : " + suma );
    }
}