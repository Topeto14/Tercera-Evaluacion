package TerceraEvaluacionProgramacion.EstacionesMeteorologicas;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class EstacionMeteorologica {
    //Propierties
    private Long id;
    private String nombre;
    private Comunidad comunidad;
    private Double latitud;
    private Double longitud;

    private TreeSet<RegistroDatosDia> registros;

    //Constructor

    public EstacionMeteorologica(Long id, String nombre, Comunidad comunidad, Double latitud, Double longitud, TreeSet<RegistroDatosDia> registros) {
        this.id = id;
        this.nombre = nombre;
        this.comunidad = comunidad;
        this.latitud = latitud;
        this.longitud = longitud;
        this.registros = new TreeSet<>();
    }
    //Getters And Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Comunidad getComunidad() {
        return comunidad;
    }

    public void setComunidad(Comunidad comunidad) {
        this.comunidad = comunidad;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public TreeSet<RegistroDatosDia> getRegistros() {
        return registros;
    }

    public void setRegistros(TreeSet<RegistroDatosDia> registros) {
        this.registros = registros;
    }
    //Tostring

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EstacionMeteorologica{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", comunidad=").append(comunidad);
        sb.append(", latitud=").append(latitud);
        sb.append(", longitud=").append(longitud);
        sb.append(", registros=").append(registros);
        sb.append('}');
        return sb.toString();
    }

    //equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstacionMeteorologica that = (EstacionMeteorologica) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    /**
     * Metodo para añadir un nuevo registro
     * @param registroDia registro a añadir
     */
    public void nuevoRegistro_(RegistroDatosDia registroDia){
        registros.add(registroDia);
    }
    /**
     * Metodo para eliminar un nuevo registro
     * @param registroDia registro eliminar
     */
    public void eliminiarRegistro(RegistroDatosDia registroDia){
        registros.remove(registroDia);
    }
    /**
     * Buscar los registros de una fecha en concreto
     * @param fecha fecha de la que queremos obtener los registros
     * @return registros en esa fecha
     */
    public List<RegistroDatosDia> buscarRegistro(LocalDate fecha){
        return this.registros.stream()
                .filter(registroDatosDia -> registroDatosDia.getFecha().equals(fecha))
                .toList();
    }
}
