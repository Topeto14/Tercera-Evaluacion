package TerceraEvaluacionProgramacion.EstacionesMeteorologicas;

import java.time.LocalDate;
import java.util.Objects;

public class RegistroDatosDia {
    //Atributos
    private  Long id;
    private LocalDate fecha;
    private Double tempMax;
    private Double tempMin;
    private Double tempMedia;

    //Constructores

    public RegistroDatosDia(Long id, LocalDate fecha, Double tempMax, Double tempMin, Double tempMedia) {
        this.id = id;
        this.fecha = fecha;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.tempMedia = tempMedia;
    }
    //Getter And Setters

    public Long getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public Double getTempMedia() {
        return tempMedia;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public void setTempMedia(Double tempMedia) {
        this.tempMedia = tempMedia;
    }
    // Tostring
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RegistroDatosDia{");
        sb.append("id=").append(id);
        sb.append(", fecha=").append(fecha);
        sb.append(", tempMax=").append(tempMax);
        sb.append(", tempMin=").append(tempMin);
        sb.append(", tempMedia=").append(tempMedia);
        sb.append('}');
        return sb.toString();
    }
    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistroDatosDia that = (RegistroDatosDia) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
