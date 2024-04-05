package SegundaEvaluacionProgramacion.Probando.Tienda;

import SegundaEvaluacionProgramacion.Probando.Producto.Producto;

public class TestTienda {
    public static void main(String[] args) {
        Tienda t1 = new Tienda(" Hakunan matata ");
        Producto p1 = new Producto("ordenador" , 1000);
        t1.addProducto(p1);
        t1.addProducto(new Producto(" apple ", 2000));
        System.out.println(t1);
    }
}
