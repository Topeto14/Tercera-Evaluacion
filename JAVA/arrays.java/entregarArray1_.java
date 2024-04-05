import java.util.Arrays;

public class entregarArray1_ {
    /*1. Programa Java que guarda en un array 20 números enteros que se generen aleatoriamente entre -100 y 100. A 
        continuación, se recorre el array y calcula cuántos números son positivos y cuántos negativos. */
        /**
         * Generara numeros aleatorios entre el minimo y el maximo
         * @param min Coger el numero minimos de los aleatorios 
         * @param max Coger el numero maximos de los aleatorios
         * @return Devuelve los numeros aleatorios generados entre el rango 
         */
    public static int generarNumero(int min, int max){
        return (int) ((Math.random()*(max-min +1) + min));

    }
    public static void main(String[] args) {
        int numeros[] = new int [20];
        int positivos = 0; // contadores de numero positivos
        int negativos = 0; //contadores de numeros negativos 

        for(int i =0; i<numeros.length; i++){ 
            numeros[i]=generarNumero(-100, 100);//Aqui se generan numeros aleatorios del -100 al 100
        }
        

        for(int i=0; i<numeros.length; i++){
            if(numeros[i]>=0){ //Los numeros mayores o iguales que 0 se guardaran como positivos 
                positivos++; //El contador de los numero positivos
            }else{
                negativos++;//Por lo tanto aqui se guarda el resto que seran los numero negativos
            }  
        }

        System.out.println(Arrays.toString(numeros)); //saldran los numeros aleatorios.
        System.out.println(" Hay " + positivos + " numeros positivos.");//saldra por pantalla los positvos mediante el contador.
        System.out.println(" Hay " + negativos + " numeros negativos.");//saldra por pantalla los negativos mediante el contador.
    }
    
}
