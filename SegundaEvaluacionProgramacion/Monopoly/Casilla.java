package SegundaEvaluacionProgramacion.Monopoly;

public class Casilla {
    //--Propiedades--

    private String nombre ;

    private int numero ;

    //--Constructor--

    public Casilla(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    //--getters and setters --
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Casilla{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", numero=").append(numero);
        sb.append('}');
        return sb.toString();
    }

}
