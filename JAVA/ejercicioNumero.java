public class ejercicioNumero {
    public static void main(String[] args) {
        
        // 1. Si A = 6, B = 2, C = 3, indicar el resultado final de las siguientes expresiones aritméticas:
        int a, b, c;
        int resultado ;

        a = 6 ;
        b = 2 ;
        c = 3 ;

        // el ejerccio  a. (A * C) % C

        resultado = (a * c) % c;
        System.out.println("el resultado del ejercicio a es " +  resultado);

        // el ejerccio <b. A * B / C

        resultado =( (a * b) / c);
        System.out.println("el resultado del ejercicio b es " +  resultado);
        
        // el ejercicio  c. C % B + C * B

        resultado = ((3 % 2) + (3 * 2));
        System.out.println("el resultado del ejercicio c es " +  resultado);
    
        // el ejercicio  d. A % ( A * B * C / (B + C) )
        
        resultado = 6 % (6 * 2 * 3/(2 + 3));
        System.out.println("el resultado del ejercicio d es " + resultado);

        // el ejercicio  e. B * B + C – B * (A % B )

        resultado = ((2 * 2) + (3 - 2) * (6 % 2));
        System.out.println("el resultado del ejercicio e es " + resultado); 

       
    }
}
