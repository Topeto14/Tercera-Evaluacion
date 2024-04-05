package SegundaEvaluacionProgramacion.Ejercicio_POO.Ejercicio_4_Finanza;
    /**Realiza una clase Finanzas que convierta dólares a euros y viceversa. Como propiedad se almacena únicamente el
    cambio dólar-euro, no se almacena una cantidad sino el tipo de cambio. Codifica los métodos
    dolaresToEuros(double dolares) y eurosToDolares(double euros). Prueba que dicha clase funciona
    correctamente haciendo conversiones entre euros y dólares. La clase debe tener:
    - Un constructor Finanzas() por defecto el cual establecerá el cambio dólar-euro en 1.36.
    - Un constructor Finanzas(double), el cual permitirá configurar el cambio dólar-euro.
    - Getters y setters
    Prueba la clase en otra clase TestFinanzas */

public class Finanzas {
    //--Atributos / Propiedad --
    private double dolarEuro ;

        Finanzas(double dolarEuro) {
            this.dolarEuro = dolarEuro;
        }

        //--Constructor--
        Finanzas(){
            this.dolarEuro = 1.36;
        }
        //--getter and setter
        public double getDolarEuro(){
            return dolarEuro;
        }

        public void setDolarEuro(double dolarEuro) {
            this.dolarEuro = dolarEuro;
        }
        //--Metodos--
        public double dolaresToEuros(double dolares){
            return dolarEuro * dolares ;
        }
        public double eurosToDolares(double euros){
            return euros / dolarEuro ;
        }

    }
