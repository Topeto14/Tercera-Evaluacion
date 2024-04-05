package SegundaEvaluacionProgramacion.Ejercicio_POO.Ejercicio_5_Satelite;

public class Satelite {
    //--Atributos-Propiedades--
    private double meridiano ;
    private double paralelo ;
    private double distancia_tierra;

   Satelite (double m, double p, double d){
       meridiano = m ;
       paralelo = p ;
       distancia_tierra = d ;
   }
    //--Constructor--
    Satelite(){

        meridiano=paralelo=distancia_tierra=0;
    }

    //--Setter --
    public void setPosicion(double m, double p, double d){
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }


    //--Metodo--
    public void printPosicion(){
        System.out.println(" El satelite se encuenta en ");
        System.out.println(" el paralelo " + paralelo + " meridiano " + meridiano ) ;
        System.out.println(" a una distancia de la Tierra de " + distancia_tierra + " Kms. ");
    }
    public void variaAltura(double desplazamiento){ // Aqui hace que la distancia a la tierra se aleje o se acerque
       distancia_tierra += desplazamiento;
    }
    public boolean enOrbita(){
       return distancia_tierra > 0 ;
    }
    public void variaPosicion(double variap, double variam ){
       meridiano += variam ;
       paralelo += variap ;
    }
}
