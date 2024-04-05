package SegundaEvaluacionProgramacion.Examen_2_Evaluacion;

import java.util.ArrayList;

public class Atrapame {
    private ArrayList<Vuelo>vuelos;
    private ArrayList<ReservarVuelo>reservas;

    public Atrapame(ArrayList<Vuelo> vuelos, ArrayList<ReservarVuelo> reservas) {
        this.vuelos = vuelos;
        this.reservas = reservas;
    }

    public Atrapame() {
    }

    public ArrayList<ReservarVuelo> getReservas() {
        return reservas;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

}
