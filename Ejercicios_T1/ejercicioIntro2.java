import java.util.Scanner;

public class ejercicioIntro2 {
    public static void main(String[] args) {
        //Ejercicio 2
        //Calcular el perímetro y área de un rectángulo dada su base y su altura.
        
        double perimetro, area, base, altura;
        
        

        //leer el scanner para poder leer el teclado
        Scanner sc= new Scanner(System.in);

        //Preguntar por la base del rectangulo
        System.out.println("Podrias decirme la base del rectangulo");
        base =sc.nextDouble();

        //Preguntar por la altura del rectangulo
        System.out.println("Podrias decirme la altura del rectangulo");
        altura =sc.nextDouble();

        //Tener las formulas del perimetro y el area
        perimetro = 2* (base + altura);
        area =(base * altura);

        //Responder con la solucion del perimetro y el area 
        System.out.println(" el perimetro del rectangulo es " + perimetro + " Y el area de tu rectangulo es " + area );
        


    }
}
