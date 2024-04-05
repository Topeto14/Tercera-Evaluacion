import java.util.Arrays;
import java.util.Scanner;

//public class entregarArray9 {
    /*9. Realizar un programa que lea los tiempos en los que de 10 corredores han acabado una carrera. El programa debe 
    determinar qué corredores tienen el primer, segundo y último puesto, así como cuál es el tiempo medio en que 
    se ha corrido la carrera. Pista: ordénalo antes. */
    /**
    public static boolean numeroRepetido(int numeros, int matriz[]){
        for (int i = 0; i < matriz.length; i++) {
            if (numeros==matriz[i]) { 
                return true;     
            }
        }
        return false;  
    }

    }
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double tabla [] = new double [10];
        double media = tabla.length;
        double suma = 0 ;
        for(int i=0; i<tabla.length; i++){
            System.out.println(" Dime tiempo del participante " + (i+1));
            tabla[i] = Double.parseDouble(teclado.nextLine());
            suma= suma + tabla[i];
        }

        Arrays.sort(tabla);
        System.out.println(Arrays.toString(tabla));

        System.out.println(" El mejor tiempo es "+tabla[0]);
        System.out.println(" El segundo mejor tiempo es " + tabla[1]);
        System.out.println(" El ultimo tiempo es : " + tabla[9]);
        System.out.println(" El tiempo medio es : " + (suma /media));

    }

}*/
