import java.util.Scanner;

//Marcus y Julius son dos legionarios aficionados a los dados. Hoy han pensado un nuevo juego. Primero deciden el número de turnos a jugar, 
//nosotros lo pediremos por teclado.

//En cada turno cada jugador lanza un dado de 10 caras.

//Si un jugador saca un valor mayor que el otro, se suman los puntos de los dos dados al ganador.

//Si los dos jugadores sacan el mismo valor , la suma de los dos se acumulan para la proxima tirada. Si es el ultimo eso puntos se pierden.

//Debeis mostrar la partida de los jugadores, detallando las puntuaciones de cada uno y quien gana cada turno.

//Podeis hacer funciones para hacer la tirada de dados, para calacular el ganador.


public class DadosClaseMarcuSyJulius {


    public static int generarTirada(){
    
        int tirada;

       tirada = (int) (Math.random()*10)+1;
       return tirada;
    }




    public static void main(String[] args) {
        int totalempate=0;
        int totaljugador1=0;
        int totaljugador2=0;
        int tirada1,tirada2;
        int turnosjugar;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el número de turnos a jugar");
        turnosjugar = sc.nextInt();

        for(int i=1; i<=turnosjugar; i++) {
            System.out.println("Turnos" + i);
        


       tirada1 = generarTirada();
       tirada2 = generarTirada();

       System.out.println(" Marcus " + tirada1 + " Julius " + tirada2);
        
       if(tirada1>tirada2){
        System.out.println("Marcus ha ganado");
        totaljugador1 = totaljugador1 +(tirada1+tirada2);

        if(totalempate>0){
            totaljugador1 = totaljugador1 +totalempate;
            totalempate=0;
        }
        
       }

       else if(tirada2>tirada1){
        System.out.println("Julius ha ganado");
        totaljugador2 = totaljugador2 +(tirada1+tirada2);

        if(totalempate>0){
            totaljugador2 = totaljugador2 +totalempate;
            totalempate=0;
       }

       else { //Empate
        totalempate = totalempate + (tirada1+tirada2);

       }

       System.out.println(" Marcus lleva " + totaljugador1);
       System.out.println(" Julios lleva " + totaljugador2);
       System.out.println();
    }

    }
    System.out.println("Total de Marcus " + totaljugador1);
    System.out.println("Total de Julius " + totaljugador2);

    
    }
    }
        
    
    

