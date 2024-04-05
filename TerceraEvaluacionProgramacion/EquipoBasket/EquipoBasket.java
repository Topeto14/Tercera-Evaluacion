package TerceraEvaluacionProgramacion.EquipoBasket;

import java.util.HashSet;
import java.util.Objects;

public class EquipoBasket {
    private String nombre;
    private Double partidosGanados;
    private Double partidosPerdidos;
    private HashSet<JugadorBasket>jugadores = new HashSet<>();

    public EquipoBasket() {
    }
    //--Constructor inicializará en set --
    public HashSet<JugadorBasket> setjugadores() {
        return jugadores;
    }
    //--Constructor completo--
    public EquipoBasket(String nombre, Double partidosGanados, Double partidosPerdidos, HashSet<JugadorBasket> jugadores) {
        this.nombre = nombre;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.jugadores = jugadores;
    }
    //--getters y setters--
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(Double partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public Double getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(Double partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public HashSet<JugadorBasket> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<JugadorBasket> jugadores) {
        this.jugadores = jugadores;
    }
    //--Equals--
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipoBasket that = (EquipoBasket) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
    //--To stings--
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EquipoBasket{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", partidosGanados=").append(partidosGanados);
        sb.append(", partidosPerdidos=").append(partidosPerdidos);
        sb.append(", jugadores=").append(jugadores);
        sb.append('}');
        return sb.toString();
    }
    //--Metodos--
    public JugadorBasket buscarJugador (String nombre){ //--Buscar un jugador
        for(JugadorBasket jugador : jugadores){
            if(jugador.getNombreJugador().equals(nombre)){
                return jugador;
            }
        }
        return null;
    }
    public JugadorBasket buscarJugadorDorsal (Integer dorsal){ //--Buscar jugador a traves del dorsal
        for (JugadorBasket jugador : jugadores){
            if(jugador.getDorsal().equals(dorsal)){
                return jugador;
            }
        }
        return null;
    }
    public void mostrarEquipo(){   //--Que liste todo el equipo de baloncesto--//
        System.out.println("Equipo: " + nombre);
        for (JugadorBasket jugador :jugadores){
            System.out.println(jugador);
        }
    }

    public void addJugadorBasket (JugadorBasket jugador) { //--Agrega jugadores
        jugadores.add(jugador);
    }
    public void delJugadorBasket (JugadorBasket jugador){ //--Elimina jugadores
        jugadores.remove(jugador);
    }
}
