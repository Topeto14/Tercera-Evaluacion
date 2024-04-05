import java.util.Scanner;


public class ejercicio1Array {
    public static void main(String[] args) {

        String letras[] = new String[5];
        String inverso[] = new String[5];

        Scanner in = new Scanner(System.in);
        int cont = 0;
        try {
            for (int i = 0; i < letras.length; i++) {
                System.out.println("introduce palabras");
                letras[i] = in.nextLine();

            }


        } catch (Exception e) {
            System.out.println("e.getmessegge");
            System.out.println("Debes introducir palabras");
            // TODO: handle exception
        }
            
        /*for(int i=letras.length - 1; i>=0; i--){
            inverso[letras.length-1-i]= letras[i];*/


    }
}

