package TerceraEvaluacionProgramacion.Stream.Strem2.PaisesDelMundo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pais {
    public static Integer codigo = 0;
    private Integer codigoPais;
    private String nombre;
    public Continente continente;
    private Integer superficie;
    private Integer poblacion;
    private Ciudad capital;
    private List<Ciudad> ciudades;

    //Constructores


    public Pais() {

    }

    public Pais( String nombre, Continente continente, Integer superficie, Integer poblacion) {
        this.nombre = nombre;
        this.continente = continente;
        this.superficie = superficie;
        this.poblacion = poblacion;
        this.ciudades = new ArrayList<>();
    }

    public static Integer getCodigo() {
        return codigo;
    }



    public Integer getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(Integer codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    public Ciudad getCapital() {
        return capital;
    }

    public void setCapital(Ciudad capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pais{");
        sb.append("codigoPais=").append(codigoPais);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", continente=").append(continente);
        sb.append(", superficie=").append(superficie);
        sb.append(", poblacion=").append(poblacion);
        sb.append(", capital=").append(capital);
        sb.append(", ciudades=").append(ciudades);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(codigoPais, pais.codigoPais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoPais);
    }

    public void addCiudad(Ciudad c){
        this.ciudades.add(c);
    }
    public void delCiudad(Ciudad c){
        this.ciudades.remove(c);
    }
}
