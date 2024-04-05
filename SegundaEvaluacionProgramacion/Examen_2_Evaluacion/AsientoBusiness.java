package SegundaEvaluacionProgramacion.Examen_2_Evaluacion;

public class AsientoBusiness extends Asiento {

    private boolean comida;
    public Persona(long id, String nombre, String apellidos, String dniPasaporte, String email, String direccion, String ciudad, String pais, String telefono, String preferenciasComida, String restriccionesMedicas, Enums.TipoAsiento Turista){
        super ( id, nombre, apellidos, dniPasaporte, email, direccion, ciudad, pais, telefono, preferenciasComida, restriccionesMedicas, AsientoBusiness);
        this.comida = comida ;
    }

    public boolean isComida() {
        return comida;
    }

    public void setComida(boolean comida) {
        this.comida = comida;
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
    public String getDniPasaporte() {
        return dniPasaporte;
    }

    public void setDniPasaporte(String dniPasaporte) {
        this.dniPasaporte = dniPasaporte;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoBusiness{");
        sb.append("comida=").append(comida);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
    //--METODOS--
    public double calcularPrecio (double precioBase){
        double precioBase = super.getClass(calcularPrecio(precioBase);
        return precioBase;
    }
}
