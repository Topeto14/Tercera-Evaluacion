package TerceraEvaluacionProgramacion.Stream.Strem2.PaisesDelMundo;

import java.util.Objects;

public class Ciudad {
    public static Integer codigo = 0 ;
    private Integer codigoCiudad;
    private String nombre;
    private Integer poblacion;
    private Pais pais;

    //Constructor


    public Ciudad( String nombre, Integer poblacion, Pais pais) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pais = pais;
    }

    public static Integer getCodigo() {
        return codigo;
    }

    public Integer getCodigoCiudad() {
        return codigoCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public Pais getPais() {
        return pais;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ciudad{");
        sb.append("codigoCiudad=").append(codigoCiudad);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", poblacion=").append(poblacion);
        sb.append(", pais=").append(pais);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ciudad ciudad = (Ciudad) o;
        return Objects.equals(codigoCiudad, ciudad.codigoCiudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoCiudad);
    }
}
