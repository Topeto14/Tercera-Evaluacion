package SegundaEvaluacionProgramacion.Ejercicio_POO.Ejercicio_5_Satelite;

public class TestSatelite {
    public static void main(String[] args) {
        Satelite s1 = new Satelite() ;
        s1.setPosicion(4,6,500);
        s1.variaAltura(45);
        s1.enOrbita();
        s1.printPosicion();
        s1.variaPosicion(5,7);
        s1.printPosicion();
    }
}
