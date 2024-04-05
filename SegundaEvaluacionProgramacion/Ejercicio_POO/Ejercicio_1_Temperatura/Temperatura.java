package SegundaEvaluacionProgramacion.Ejercicio_POO.Ejercicio_1_Temperatura;
/** 1. Realiza una clase Temperatura, la cual convierta grados Celsius a Farenheit y viceversa. Para ello, crea dos
 métodos double celsiusToFarenheit(double celsius) y double farenheitToCelsius(double
 farenheit). La clase Temperatura no tendrá ninguna propiedad, solo esos dos métodos.
 En la construcción ten en cuenta las siguientes fórmulas:
 - Farenheit a Celsius C = (F – 32)/1,8
 - Celsius a Farenheit F = (1,8)C + 32 */

 public class Temperatura {
     //--METODOS--//
     public double celsiusToFarenheit (double celsius){

         return (((1.8) * celsius )+32);
     }
     public  double farenheitToCelsius (double farenheit){

         return (farenheit - 32) / 1.8 ;
     }

    }
