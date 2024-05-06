package TerceraEvaluacionProgramacion.Examen2023.modelos;

import java.util.Objects;

public class Hotel implements Comparable<Hotel>{
    //Prop
    public static Long numero = 1L;

    protected Long id ;

    protected String nombre ;
    protected String direccion;
    protected String localidad;
    protected String provincia;
    protected Integer numHabitaciones;
    protected Double precioNoche;
    protected Integer calificacion;

    //Constructor

    public Hotel(String nombre, String direccion, String localidad, String provincia, Integer numHabitaciones, Double precioNoche, Integer calificacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.numHabitaciones = numHabitaciones;
        this.precioNoche = precioNoche;
        this.calificacion = calificacion;
        this.id = Hotel.numero++;
    }

    //Getters Ands Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Integer getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(Integer numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public Double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(Double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    //To String

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hotel{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", provincia='").append(provincia).append('\'');
        sb.append(", numHabitaciones=").append(numHabitaciones);
        sb.append(", precioNoche=").append(precioNoche);
        sb.append(", calificacion=").append(calificacion);
        sb.append('}');
        return sb.toString();
    }

    //equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(id, hotel.id) && Objects.equals(nombre, hotel.nombre) && Objects.equals(direccion, hotel.direccion) && Objects.equals(localidad, hotel.localidad) && Objects.equals(provincia, hotel.provincia) && Objects.equals(numHabitaciones, hotel.numHabitaciones) && Objects.equals(precioNoche, hotel.precioNoche) && Objects.equals(calificacion, hotel.calificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, direccion, localidad, provincia, numHabitaciones, precioNoche, calificacion);
    }

    //Implements comparable por calificación
    @Override
    public int compareTo(Hotel o) {
        return this.getCalificacion().compareTo(o.getCalificacion());
    }
}
