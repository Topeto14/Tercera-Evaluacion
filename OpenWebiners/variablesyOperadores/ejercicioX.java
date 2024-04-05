
/**
 * 10. Escribe un programa en Java que calcule cuál es el espacio recorrido por un objeto, como por ejemplo, una sonda espacial, que se mueve a velocidad constante. Podemos suponer que el objeto ha recorrido un espacio inicial de 150.000 km y se mueve a una velocidad 17 km por segundo.
 */

public class ejercicioX {
    public static void main(String[] args) {
        double espacioInicial = 150000.0 ; // KM
        double velocidad = 17.0 ; // Km/s
        double tiempo = 10000.0 ; // s 
        double espacioViaje = espacioInicial + ( velocidad * tiempo);
        System.out.println(" El espacio recorrido por una sonda espacial es : " + espacioViaje + " Km ");
        
    }
    
}
