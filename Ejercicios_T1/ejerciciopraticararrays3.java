import java.util.Scanner;

public class ejerciciopraticararrays3 {
    /*4. Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen una
    altura superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado y debe
    ser entero positivo */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        

        try {
            int numpersonas;

            System.out.println("Dime el numero de personas que voy a calcular la altura");
            numpersonas=Integer.parseInt(in.nextLine());
            double media = 0 ;
        
            double altura[]= new double[numpersonas];
        
            for(int i=0; i<altura.length; i++){
            
                System.out.println("Dime la altura de la " + (i+1) + " persona");
                altura[i]= Double.parseDouble(in.nextLine());
                media = media + altura[i];
            }
           
            System.out.println("La media es " + media/numpersonas);
            

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Debes introducir una altura");
        }
            

       


    }
    
}
