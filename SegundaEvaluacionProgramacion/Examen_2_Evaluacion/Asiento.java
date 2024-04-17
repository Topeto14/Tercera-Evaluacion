/*package SegundaEvaluacionProgramacion.Examen_2_Evaluacion;

import java.util.Objects;

public abstract class Asiento {
    private long id;
    private Pasajero pasajero;
    private double precioBase;
    private Integer fila;
    private String letra;

    public Enums.TipoAsiento tipo;

    public Asiento(long id, double precioBase, Integer fila, String letra) {
        this.id = id;
        this.precioBase = precioBase;
        this.fila = fila;
        this.letra = letra;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asiento asiento = (Asiento) o;
        return id == asiento.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    //--METODOS--
    public double calcularPrecio (double precioBase){
        double precioBase = super.getClass(calcularPrecio(precioBase);
        return precioBase;
    }
    public String getCodigo(String fila, String letra){
        return this.fila + this.letra;
    }

}*/
