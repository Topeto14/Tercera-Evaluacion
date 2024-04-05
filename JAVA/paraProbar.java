

public class paraProbar {
    public static void main(String[] args) {
        
       

        //**15. Escriba un programa que escriba en la pantalla cuánto le dará su banco después de seis meses si pone 
        //2000€ en una cuenta a plazo fijo al 2, 75% anual. Recuerde que al pagarle los intereses el banco le 
        //retendrá el 18% para hacienda.

        int euros;
        double resultado1,resultado2, resultado3,  simestral, anual, hacienda;
        euros = 2000;
        anual = 2.75;
        simestral = anual / 2;
        hacienda = 0.18 ;
        
        resultado1 = (euros * simestral); //2750€
        System.out.println("Esto es lo ha amortizado en el banco despues de seis meses " + resultado1 );

        resultado2 = (resultado1) * hacienda; // - 495€ 
        resultado3 = resultado1 - resultado2; //2750€ - 495€ =2255€

        System.out.println("Al pagarle ha hacienda tendra " + resultado3 );




       
        
    }
}



