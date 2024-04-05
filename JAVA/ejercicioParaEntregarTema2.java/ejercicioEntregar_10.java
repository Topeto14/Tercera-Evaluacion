public class ejercicioEntregar_10 {

    public static void main(String[] args) {
        
        //10. Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
        //número de líneas, que se pida por teclado.
        //*
        //**
        //***
        //****

        int num =4 ;

        for (int i=1; i<=num; i++ ){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
