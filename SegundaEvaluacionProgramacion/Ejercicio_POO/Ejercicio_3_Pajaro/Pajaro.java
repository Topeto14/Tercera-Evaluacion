package SegundaEvaluacionProgramacion.Ejercicio_POO.Ejercicio_3_Pajaro;

public class Pajaro { // La clase es correcta porque tiene la primera letra en mayuscula y singular.
    //--Atributos--
    private int edad ;
    private String color ;
    //--Metodos--
    public void setedad(int e){
        edad = e ;}
    public void printedad(){
        System.out.println(" La edad del pajaro es : " + edad);
    }
    public void setcolor(String c){
        color = c;}
    public void printcolor(){
        System.out.println(" El color del pajaro es : " + color);
    }
}
