package SegundaEvaluacionProgramacion.Ejercicio_POO.Ejercicio_2_Coche;

public class Coche {
    //--Atributo--
    private int velocidad;

    //--Constructor--
    Coche(){
        velocidad = 0 ; }

    //--Metodos--

    public int getVelocidad() { // Este metodo devuelve velocidad actual.
        return velocidad;
    }
    public void acelera(int mas){ //Este método actualiza la velocidad a más kilometros mas (suma).

        velocidad += mas ;
    }

    public void Frena(int menos) { //Este método actualiza la velocidad a menos kilometros menos (resta).

        velocidad -= menos ;
    }

}
