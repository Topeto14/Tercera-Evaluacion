/*package SegundaEvaluacionProgramacion.Tema6.Ejercicio_6_Agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;

    //--Metodos--
    public void existeContacto(Contacto c) {
        boolean existe = true;
        for (Contacto contacto : this.contactos) {
            if (!contactos.contains(c)) {
                existe = false;
            }
        }
    }
    public void addContacto(Contacto c){
        contactos.add(c);
    }
    public void listarContactos(Contacto c){

    }
    public void buscarContacto(Contacto c){

        if(existeContacto(Contacto c)){
            int posicion = contactos.indexOf(c);
            return; contactos.get(posicion);
        }
    }
    public void eliminarContacto(Contacto c){
        contactos.remove(c);
    }

}
*/