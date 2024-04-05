package SegundaEvaluacionProgramacion.Examen_2_Evaluacion;

import java.util.ArrayList;

public class ReservarVuelo {
    private long id ;
    private Vuelo vuelo ;
    private ArrayList<Pasajero>pasajeros;
    private Enums.TipoTarifa tipoT;
    private Enums.TipoAsiento tipoA;

    public ReservarVuelo(long id, Vuelo vuelo) {
        this.id = id;
        this.vuelo = vuelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ReservarVuelo{");
        sb.append("id=").append(id);
        sb.append(", vuelo=").append(vuelo);
        sb.append('}');
        return sb.toString();
    }

}

