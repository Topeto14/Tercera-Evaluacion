package TerceraEvaluacionProgramacion.Peliculas;

public class Genero {
<<<<<<< HEAD
    private static long contador = 0;
     private int id ;
=======
    private static long contador=0;
    private long id;
>>>>>>> origin/main
    private String nombre;

    public Genero(String nombre) {
        this.nombre = nombre;
        this.id = Genero.contador++;
    }

<<<<<<< HEAD
    public int getId() {
=======
    public long getId() {
>>>>>>> origin/main
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
<<<<<<< HEAD
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genero género = (Genero) o;
        return id == género.id;
=======
    public String toString() {
        final StringBuffer sb = new StringBuffer("Genero{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Genero genero = (Genero) o;

        return id == genero.id;
>>>>>>> origin/main
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Género{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
=======
>>>>>>> origin/main
}
