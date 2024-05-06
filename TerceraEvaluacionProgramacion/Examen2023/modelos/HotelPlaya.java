package TerceraEvaluacionProgramacion.Examen2023.modelos;

public class HotelPlaya extends Hotel{
    private boolean aireAcondicionado;

    public HotelPlaya(String nombre, String direccion, String localidad, String provincia, Integer numHabitaciones, Double precioNoche, Integer calificacion,boolean aireAcondicionado) {
        super(nombre, direccion, localidad, provincia, numHabitaciones, precioNoche, calificacion);
    }
}
