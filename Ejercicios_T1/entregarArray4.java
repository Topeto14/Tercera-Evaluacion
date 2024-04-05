import java.util.Scanner;

public class entregarArray4 {
    /*4. Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen una
    altura superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado y debe
    ser entero positivo */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
          
        try {
            int numpersonas;

            System.out.println("Dime el numero de personas que voy a calcular la altura");
            numpersonas=Integer.parseInt(in.nextLine());
           
            double sumaalturas = 0 ;
            double mediareal = 0 ;
        
            double altura[]= new double[numpersonas];

            int contmayor = 0 ;
            int contmenor = 0 ;
            
            for(int i=0; i<altura.length; i++){
            
                System.out.println("Dime la altura de la " + (i+1) + " persona");
                altura[i]= Double.parseDouble(in.nextLine());                 
            }

            for(int i=0; i<altura.length; i++){
                sumaalturas = sumaalturas + altura[i];    
            }
             mediareal = sumaalturas / altura.length;

            for(int i=0; i<altura.length; i++){
                if(altura[i]> mediareal){
                    contmayor++;
                }else if(altura[i]< mediareal){
                    contmenor++; 
                }
            }
              
            System.out.println("La media es " + mediareal );            
            System.out.println( + contmayor + " es el numero de personas con la media superior");
            System.out.println( + contmenor + " es el numero de personas con la media inferior");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Debes introducir una altura");
        }
            
    }
    
}