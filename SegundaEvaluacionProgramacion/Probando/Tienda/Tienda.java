package SegundaEvaluacionProgramacion.Probando.Tienda;

import SegundaEvaluacionProgramacion.Probando.Producto.Producto;

import java.util.ArrayList;
import java.util.Objects;

public class Tienda {
    //--Atributos--
    private String nombre ;
    private ArrayList<Producto> productos ;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tienda{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", productos=").append(productos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tienda tienda = (Tienda) o;
        return Objects.equals(nombre, tienda.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public void addProducto(Producto p){
        this.productos.add(p);
    }
}
