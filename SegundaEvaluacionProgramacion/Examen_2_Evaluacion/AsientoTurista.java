/*package SegundaEvaluacionProgramacion.Examen_2_Evaluacion;

public class AsientoTurista extends Asiento {
    private boolean ventana ;

    public Persona(long id, String nombre, String apellidos, String dniPasaporte, String email, String direccion, String ciudad, String pais, String telefono, String preferenciasComida, String restriccionesMedicas, Enums.TipoAsiento Turista){
        super ( id, nombre, apellidos, dniPasaporte, email, direccion, ciudad, pais, telefono, preferenciasComida, restriccionesMedicas, AsientoTurista);
        this.ventana = ventana ;
    }

    public AsientoTurista(long id, double precioBase, Integer fila, String letra, boolean ventana) {
        super(id, precioBase, fila, letra);
        this.ventana = ventana;
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
    public Enums.TipoAsiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Enums.TipoAsiento asiento) {
        this.asiento = asiento;
    }

    public boolean isVentana() {
        return ventana;
    }

    public void setVentana(boolean ventana) {
        this.ventana = ventana;
    }
    public String getDniPasaporte() {
        return dniPasaporte;
    }

    public void setDniPasaporte(String dniPasaporte) {
        this.dniPasaporte = dniPasaporte;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoTurista{");
        sb.append("ventana=").append(ventana);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

 /*public double calcularPrecio(double precioBase, boolean ventana){
        double precioBase = super.getPrecioBase();
    return precioBase;
    if (ventana<=0)
        return false;
    if (ventana>0)
        return true;
    }
}*/

