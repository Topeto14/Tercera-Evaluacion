import java.util.Scanner;

public class elegirunmenu {
    public static void main(String[] args) {
        //Ejercicio 9
        //Realizar un ejemplo de menú, donde podemos escoger las distintas opciones (Opción A,
        //Opción B, Salir) hasta que seleccionamos la opción de “Salir”.

        int opcion=0 ;

        Scanner sc = new Scanner(System.in);
        

        while (opcion!=4) {
            
        System.out.println("---- MENU ----");
        System.out.println("Añadir");
        System.out.println("Eliminar");
        System.out.println("Borrar todo ");
        System.out.println("Salir");
        System.out.println("");

        System.out.println("Introduce una opcion");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1: System.out.println("añadir");
                
                break;

                case 2: System.out.println("Eliminado");
                
                break;

                case 3: System.out.println("Limpiar todo");
                
                break;
        
            default: System.out.println("Vete!!!! que te estas rompiendo la cabeza");
                break;
        }
    }
    }
}
