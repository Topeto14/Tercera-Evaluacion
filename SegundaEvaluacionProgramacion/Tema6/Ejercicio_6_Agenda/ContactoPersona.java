package SegundaEvaluacionProgramacion.Tema6.Ejercicio_6_Agenda;

public class ContactoPersona extends Contacto {
    private String apodo ;

    @Override
    public ContactoPersona (String nombre, String apodo,String telefono){
    }
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContactoPersona{");
        sb.append("apodo='").append(apodo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
