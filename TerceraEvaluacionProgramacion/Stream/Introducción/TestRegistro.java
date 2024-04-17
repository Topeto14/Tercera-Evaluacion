package TerceraEvaluacionProgramacion.Stream.Introducción;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class TestRegistro {

    public static Double aleatorioTemperatura(Integer min, Integer max) {
        return (Math.random() * (max - min)) + min;
    }
    public static Double aleatorioHumedad(Integer min, Integer max) {
        return (Math.random() * (max - min)) + min;
    }
    public static void main(String[] args) {
        List<Registro> registros = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            Double temperatura = aleatorioTemperatura(1, 40);
            Double humedad = aleatorioHumedad(1, 100);
            LocalDateTime fechahora = LocalDateTime.now();
            registros.add(new Registro(fechahora.plusMinutes(i) , temperatura, humedad));
        }
        /* Filtrar los registros de temperatura que sean mayores a 25 grados, la humedad sea menor a
         70 y la fecha sea anterior a la fecha actual, y mostrarlos.*/
        System.out.println("Apartado a");
        registros.stream()
                .filter(registro -> registro.getTemperatura() > 25 && registro.getHumedad() < 70 && registro.getFechahora().isBefore(LocalDateTime.now()))
                .forEach(System.out::println);
        /*b. Encontrar el registro con la temperatura más alta y mostrar el registro completo.*/
        System.out.println("Apartado b ");
        registros.stream()
                .max(Comparator.comparing(registro -> registro.getTemperatura() ))
                .ifPresent(System.out::println);
        /*c. Obtener una lista con las fechas/horas de todas las tomas de datos.*/
        System.out.println("Apartado c ");
        registros.stream()
                .map(registro -> registro.getFechahora())
                .forEach(System.out::println);
        /*d. Incrementar en 5 unidades la humedad de todos los registros y mostrar las temperaturas,
        humedades y fechas/horas actualizadas.*/
        System.out.println("Apartados d");
        registros.stream()
                .peek(registro -> registro.setHumedad(registro.getHumedad()+5))
                .forEach(System.out::println);
        /*e. Encontrar el registro con la temperatura más baja que tenga una humedad mayor a 80 y
        mostrar la temperatura, humedad y fecha.*/
        System.out.println("Apartado d ");
        registros.stream()
                .filter(registro -> registro.getHumedad() > 80)
                .min(Comparator.comparing(Registro::getTemperatura))
                .ifPresent(System.out::println);
        /*f. Verificar si algún registro tiene una temperatura mayor a 30 grados, humedad mayor a 90 y
             la fecha es de hoy. Mostrar un mensaje indicando si hay algún registro que cumple esta
             condición o no*/
        System.out.println(" Apartado e ");
        boolean existe = registros.stream()
                .anyMatch(registro -> registro.getTemperatura() > 30 && registro.getHumedad() > 90 && registro.getFechahora().equals(LocalDateTime.now()));
                if( existe == true ) {
                    System.out.println(" Te encontre mal parido ");
                }else {
                    System.out.println(" Te me has escapado ");
                }
        /*g. Muestra 10 registros saltándote los 5 primeros.*/
        System.out.println("Apartado g ");
        registros.stream()
                .skip(5)
                .limit(10)
                .forEach(System.out::println);
        /*h. Muestra los registros ordenados por fecha (sorted(Comparator))
        * Como expresión lambda: (r1,r2) -> r1.getFechaHora().compareTo(r2.getFechaHora())*/
        System.out.println(" Apartado h ");
        registros.stream()
                .sorted(Comparator.comparing(Registro::getFechahora))
                .forEach(System.out::println);
        /*i. Cuenta los registros que tengan temperatura mayor a 35 grados (count())*/
        System.out.println(" Apartado i ");
        Long registroTEmperatura =registros.stream()
                .filter(registro -> registro.getTemperatura()>35)
                .count();
                System.out.println(registroTEmperatura);

        /*j. Calcular la temperatura promedio de todos los registros (transformarlo en Stream<Double>
             y llamar a average()).*/
        System.out.println("Apartado j ");
            Double TemperaturaMedia = registros.stream()
                    .mapToDouble(registro -> registro.getTemperatura())
                    .average().getAsDouble();
        System.out.println(TemperaturaMedia);

    }
}
