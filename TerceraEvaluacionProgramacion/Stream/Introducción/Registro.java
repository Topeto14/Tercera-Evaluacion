package TerceraEvaluacionProgramacion.Stream.Introducción;

import java.time.LocalDateTime;
import java.util.Objects;

public class Registro {
    private LocalDateTime fechahora;
    private Double  temperatura;
    private Double  humedad;

    public Registro() {

    }
    public Registro(LocalDateTime fechahora, Double temperatura, Double humedad) {
        this.fechahora = fechahora;
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    public LocalDateTime getFechahora() {
        return fechahora;
    }

    public void setFechahora(LocalDateTime fechahora) {
        this.fechahora = fechahora;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getHumedad() {
        return humedad;
    }

    public void setHumedad(Double humedad) {
        this.humedad = humedad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registro registro = (Registro) o;
        return Objects.equals(fechahora, registro.fechahora) && Objects.equals(temperatura, registro.temperatura) && Objects.equals(humedad, registro.humedad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechahora, temperatura, humedad);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Registro{");
        sb.append("fechahora=").append(fechahora);
        sb.append(", temperatura=").append(temperatura);
        sb.append(", humedad=").append(humedad);
        sb.append('}');
        return sb.toString();
    }
}
