import java.util.Random;

public class ejercicioEntregar14 {
    public static void main(String[] args) {

       //** 14. Realiza un programa en Java que genere números de forma aleatoria simulando la tirada de un dado.*/

        Random rand = new Random();

        int valor = rand.nextInt(6) + 1; //obtener un numero entre 6 y 1, se le suma uno porque sino tambien entraria el numero 0.

        System.out.println("El valor del dado es: " + valor);

        
    }
}
