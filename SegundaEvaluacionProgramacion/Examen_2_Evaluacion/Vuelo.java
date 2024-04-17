/*package SegundaEvaluacionProgramacion.Examen_2_Evaluacion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;

public class Vuelo {
    private String codigo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime hora;
    private double precioBase;
    private Integer asientosDisponibles;
    private ArrayList<Asiento> asientos;

    public Vuelo(Integer asientosDisponibles) {
        this.asientosDisponibles = 100;
    }

    public Vuelo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vuelo{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(codigo, vuelo.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
    //--METODOS EXTRAS--
    /*public int verificarDisponibilidad(Enums.TipoAsiento tipoAsiento){
        return tipoAsiento;
    }

    public boolean ocuparAsiento (Pasajero, Asiento){

    }

    public static liberarAsiento(Asiento){
    }

    public static diasFaltanVuelo(){}
    public Arraylist<Pasajero> getPasajero(){}


}
*/