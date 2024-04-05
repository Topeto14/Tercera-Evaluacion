package TerceraEvaluacionProgramacion.EquipoBasket;

public class JugadorBasket {
    private String nombreJugador;
    private double altura;
    private String base;
    private String alero;
    private String escolta;
    private String alapivot;
    private String pivot;
    private Integer dorsal;
    private double puntosPorPartido;
    private double rebotesPorPartido;
    private double taponesPorPartido;
    private double asistenciasPorPartido;
    private double robosPorPartido;
//--Constructores--
    public JugadorBasket() {
    }

    public JugadorBasket(String nombreJugador, double altura, String base, String alero, String escolta, String alapivot, String pivot, Integer dorsal, double puntosPorPartido, double rebotesPorPartido, double taponesPorPartido, double asistenciasPorPartido, double robosPorPartido) {
        this.nombreJugador = nombreJugador;
        this.altura = altura;
        this.base = base;
        this.alero = alero;
        this.escolta = escolta;
        this.alapivot = alapivot;
        this.pivot = pivot;
        this.dorsal = dorsal;
        this.puntosPorPartido = puntosPorPartido;
        this.rebotesPorPartido = rebotesPorPartido;
        this.taponesPorPartido = taponesPorPartido;
        this.asistenciasPorPartido = asistenciasPorPartido;
        this.robosPorPartido = robosPorPartido;
    }
//--Getters y Setters--
    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getAlero() {
        return alero;
    }

    public void setAlero(String alero) {
        this.alero = alero;
    }

    public String getEscolta() {
        return escolta;
    }

    public void setEscolta(String escolta) {
        this.escolta = escolta;
    }

    public String getAlapivot() {
        return alapivot;
    }

    public void setAlapivot(String alapivot) {
        this.alapivot = alapivot;
    }

    public String getPivot() {
        return pivot;
    }

    public void setPivot(String pivot) {
        this.pivot = pivot;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public double getPuntosPorPartido() {
        return puntosPorPartido;
    }

    public void setPuntosPorPartido(double puntosPorPartido) {
        this.puntosPorPartido = puntosPorPartido;
    }

    public double getRebotesPorPartido() {
        return rebotesPorPartido;
    }

    public void setRebotesPorPartido(double rebotesPorPartido) {
        this.rebotesPorPartido = rebotesPorPartido;
    }

    public double getTaponesPorPartido() {
        return taponesPorPartido;
    }

    public void setTaponesPorPartido(double taponesPorPartido) {
        this.taponesPorPartido = taponesPorPartido;
    }

    public double getAsistenciasPorPartido() {
        return asistenciasPorPartido;
    }

    public void setAsistenciasPorPartido(double asistenciasPorPartido) {
        this.asistenciasPorPartido = asistenciasPorPartido;
    }

    public double getRobosPorPartido() {
        return robosPorPartido;
    }

    public void setRobosPorPartido(double robosPorPartido) {
        this.robosPorPartido = robosPorPartido;
    }
//--To String--
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("JugadorBasket{");
        sb.append("nombreJugador='").append(nombreJugador).append('\'');
        sb.append(", altura=").append(altura);
        sb.append(", base='").append(base).append('\'');
        sb.append(", alero='").append(alero).append('\'');
        sb.append(", escolta='").append(escolta).append('\'');
        sb.append(", alapivot='").append(alapivot).append('\'');
        sb.append(", pivot='").append(pivot).append('\'');
        sb.append(", dorsal=").append(dorsal);
        sb.append(", puntosPorPartido=").append(puntosPorPartido);
        sb.append(", rebotesPorPartido=").append(rebotesPorPartido);
        sb.append(", taponesPorPartido=").append(taponesPorPartido);
        sb.append(", asistenciasPorPartido=").append(asistenciasPorPartido);
        sb.append(", robosPorPartido=").append(robosPorPartido);
        sb.append('}');
        return sb.toString();
    }
}
