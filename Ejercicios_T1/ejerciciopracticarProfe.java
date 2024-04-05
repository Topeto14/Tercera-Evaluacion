import  java.util.Scanner;

public class ejerciciopracticarProfe {
    public static void main(String[] args) {
        
        //1.Pide un numero por teclado. Muestra sus divisores y muestra cuantos son.
        //2.Pide una base y un exponente y muestra la pontecia, sin usar Math.powl
        //3.Programa que pinte tantos asteriscos como indique un número pedido por teclado.
        //4.Simular lanzar dos dados por teclados, repitelo hasta que salga el mismo número en los dos. Muestra el número de intentos.

        double base, exponente;
        double potencia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la base de");
        base = sc.nextDouble();
        System.out.println("Dime un exponente");
        exponente = sc.nextDouble();

        potencia = 1;
        for (int i=0; i<exponente; i++ ) {

            potencia = potencia * base ;

        }

        System.out.println("Resultado " + potencia);


    }
}
