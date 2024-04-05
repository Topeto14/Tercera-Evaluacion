package SegundaEvaluacionProgramacion.Ejercicio_POO.Ejercicio_6_SteamJuego;
import java.util.ArrayList;
import java.util.Collections;

public class SteamJuego {
    private String nombre;
    private String descripcionCorta;
    private int mediaJugadoresDiarios;
    private int diasDesdeSalida;
    private int precio;
    private int puestoMasVendidos;

    public SteamJuego(String nombre, String descripcionCorta, int mediaJugadoresDiarios, int diasDesdeSalida, int precio, int puestoMasVendidos) {
        this.nombre = nombre;
        this.descripcionCorta = descripcionCorta;
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
        this.diasDesdeSalida = diasDesdeSalida;
        this.precio = precio;
        this.puestoMasVendidos = puestoMasVendidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public int getMediaJugadoresDiarios() {
        return mediaJugadoresDiarios;
    }

    public void setMediaJugadoresDiarios(int mediaJugadoresDiarios) {
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
    }

    public int getDiasDesdeSalida() {
        return diasDesdeSalida;
    }

    public void setDiasDesdeSalida(int diasDesdeSalida) {
        this.diasDesdeSalida = diasDesdeSalida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPuestoMasVendidos() {
        return puestoMasVendidos;
    }

    public void setPuestoMasVendidos(int puestoMasVendidos) {
        this.puestoMasVendidos = puestoMasVendidos;
    }

    public void jugadoresDia(int jugadoresHoy) {
        this.mediaJugadoresDiarios = ((mediaJugadoresDiarios * diasDesdeSalida) + jugadoresHoy) / (diasDesdeSalida + 1);
    }

    public static void main(String[] args) {
        SteamJuego juego1 = new SteamJuego("Juego 1", "Descripción corta del juego 1", 1000, 30, 10, 3);
        SteamJuego juego2 = new SteamJuego("Juego 2", "Descripción corta del juego 2", 2000, 60, 20, 2);
        SteamJuego juego3 = new SteamJuego("Juego 3", "Descripción corta del juego 3", 3000, 90, 0, 1);

        ArrayList<SteamJuego> juegos = new ArrayList<>();
        juegos.add(juego1);
        juegos.add(juego2);
        juegos.add(juego3);

        Collections.sort(juegos, (juegoA, juegoB) -> juegoA.getPuestoMasVendidos() - juegoB.getPuestoMasVendidos());

        for (SteamJuego juego : juegos) {
            System.out.println("Nombre: " + juego.getNombre());
            System.out.println("Descripción corta: " + juego.getDescripcionCorta());
            System.out.println("Media de jugadores diarios: " + juego.getMediaJugadoresDiarios());
            System.out.println("Días desde la salida: " + juego.getDiasDesdeSalida());
            System.out.println("Precio: " + juego.getPrecio());
            System.out.println("Puesto en los más vendidos: " + juego.getPuestoMasVendidos());
            System.out.println();
        }    }
}
