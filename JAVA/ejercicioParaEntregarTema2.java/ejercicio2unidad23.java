import java.util.Scanner;


public class ejercicio2unidad23 {
    /*23. Pedir el día, mes y año de una fecha y mostrar la fecha del día siguiente (sin años bisiestos). Hacer 
    primero una función para determinar que la fecha introducida es correcta. */
    public static boolean validarfecha(int dia, int mes, int anio) {
        if(mes <1 || mes >12){
            return false;
        }
        if(dia < 1 || dia > 31 ){
            return false;
        }
        if( mes == 2){
            if (dia>28){
                return false;
            }  
        }
        if (mes == 4 || mes == 6 || mes ==9 || mes ==11){
            if (dia>30){
                return false;
            } 
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            
        System.out.println("dime un fecha");
        int dia;
        int mes;
        int anio;

        System.out.println("Introduce un dia ");
        dia = in.nextInt();
        System.out.println("Introduce un mes ");
        mes = in.nextInt();
        System.out.println("Introduce un anio ");
        anio = in.nextInt();
        
        while (!validarfecha(dia, mes, anio)){
            System.out.println("la fecha introducida no es correcta");

            System.out.println("Introduce un dia ");
            dia = in.nextInt();
            System.out.println("Introduce un dia ");
            mes = in.nextInt();
            System.out.println("Introduce un dia ");
            anio = in.nextInt();
        }
       

       System.out.println("La fecha del dia siguiente es :" + (dia + 1 ) + " / " + mes + " / " + anio );

       /* if(dia + 1 >31){
            System.out.println(mes+1);
        }else if(mes>12){
            System.out.println(anio+1);
        }else{
            System.out.println("La fecha del dia siguiente es :" + (dia + 1 ) + " , " + mes + " , " + " , " + anio );
        }*/

        in.close();
          
    }
}    


