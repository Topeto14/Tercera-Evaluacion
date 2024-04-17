package TerceraEvaluacionProgramacion.Stream.Strem2.PaisesDelMundo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //Paises
        Pais Bolivia = new Pais("Bolivia",Continente.america,50000,20000);
        Pais Espana = new Pais("Espana",Continente.europa,25000,50000);
        Pais Marruecos = new Pais("Marruecos",Continente.africa,100000,25000);
        Pais Japon = new Pais("Japon",Continente.asia,40000,600000);
        Pais China = new Pais("China",Continente.asia,500000,200000);
        Pais Brasil = new Pais("Brasil",Continente.america,70000,205000);
        Pais Portugal = new Pais("Portugal",Continente.europa,20000,14000);
        Pais Tunez = new Pais("Tunez",Continente.africa,4500,2000);
        Pais Australia = new Pais("Australia",Continente.oceania,120000,264000);
        Pais NuevaZelanda = new Pais("Nueva Zelanda",Continente.oceania,40000,20200);

        //Añade 3 ciudades en cada pais incluida la capital
        Ciudad madrid = new Ciudad("Madrid",200,Espana);
        Espana.addCiudad(madrid);
        Espana.setCapital(madrid);
        Espana.addCiudad(new Ciudad("Murcia",60, Espana));
        Espana.addCiudad(new Ciudad("Barcelona",100, Espana));
        Espana.addCiudad(new Ciudad("Valencia",35,Espana));

        Ciudad Lapaz = new Ciudad("La paz", 50, Bolivia);
        Bolivia.addCiudad(Lapaz);
        Bolivia.setCapital(Lapaz);
        Bolivia.addCiudad(new Ciudad("Santa Cruz",40,Bolivia));
        Bolivia.addCiudad(new Ciudad("Oruro",45,Bolivia));
        Bolivia.addCiudad(new Ciudad("Beni",14,Bolivia));

        Ciudad Rabat = new Ciudad("Rabat",15,Marruecos);
        Marruecos.addCiudad(Rabat);
        Marruecos.setCapital(Rabat);
        Marruecos.addCiudad(new Ciudad("Casa Blanca",5,Marruecos));
        Marruecos.addCiudad(new Ciudad("Tanger",9,Marruecos));
        Marruecos.addCiudad(new Ciudad("Fez",20,Marruecos));

        Ciudad tokyo = new Ciudad("Tokyo",250,Japon);
        Japon.addCiudad(tokyo);
        Japon.setCapital(tokyo);
        Japon.addCiudad(new Ciudad("Kioto",61, Japon));
        Japon.addCiudad(new Ciudad("Osaka",101, Japon));
        Japon.addCiudad(new Ciudad("Hiroshima",31,Japon));

        Ciudad pekin = new Ciudad("Pekin",2000,China);
        China.addCiudad(pekin);
        China.setCapital(pekin);
        China.addCiudad(new Ciudad("Shangai",600, China));
        China.addCiudad(new Ciudad("Wuhan",1000, China));
        China.addCiudad(new Ciudad("Chendu",350,China));

        Ciudad Brasilia = new Ciudad("Brasilia",250,Espana);
        Brasil.addCiudad(Brasilia);
        Brasil.setCapital(Brasilia);
        Brasil.addCiudad(new Ciudad("Santos",64, Brasil));
        Brasil.addCiudad(new Ciudad("Rio de janeiro",124, Brasil));
        Brasil.addCiudad(new Ciudad("Porto Alegre",39,Brasil));

        Ciudad lisboa = new Ciudad("Lisboa",24,Portugal);
        Portugal.addCiudad(lisboa);
        Portugal.setCapital(lisboa);
        Portugal.addCiudad(new Ciudad("Porto",62, Portugal));
        Portugal.addCiudad(new Ciudad("Algarve",102, Portugal));
        Portugal.addCiudad(new Ciudad("Faro",32,Portugal));

        Ciudad tunez = new Ciudad("Tunez",203,Tunez);
        Tunez.addCiudad(tunez);
        Tunez.setCapital(tunez);
        Tunez.addCiudad(new Ciudad("Murcia",63, Tunez));
        Tunez.addCiudad(new Ciudad("Barcelona",103, Tunez));
        Tunez.addCiudad(new Ciudad("Valencia",33,Tunez));

        Ciudad camberra = new Ciudad("Camberra",250,Australia);
        Australia.addCiudad(camberra);
        Australia.setCapital(camberra);
        Australia.addCiudad(new Ciudad("Brisbane",68, Australia));
        Australia.addCiudad(new Ciudad("Sidney",108, Australia));
        Australia.addCiudad(new Ciudad("Melbourne",38,Australia));

        Ciudad wellington = new Ciudad("Wellington",190,NuevaZelanda);
        NuevaZelanda.addCiudad(wellington);
        NuevaZelanda.setCapital(wellington);
        NuevaZelanda.addCiudad(new Ciudad("Murcia",66, NuevaZelanda));
        NuevaZelanda.addCiudad(new Ciudad("Barcelona",106, NuevaZelanda));
        NuevaZelanda.addCiudad(new Ciudad("Valencia",36,NuevaZelanda));

        List<Pais> paises = List.of(Bolivia,Espana,Marruecos,Japon,China,Brasil,Portugal,Tunez,Australia,NuevaZelanda);

        /* - Menor superficie */
        paises.stream()
                .min(Comparator.comparing(pais->pais.getSuperficie()))
                .ifPresent(pais -> System.out.println(pais.getNombre()));
        /*- Muestra los países ordenados por población (descendente). Muestra país y población.*/
        paises.stream()
                .sorted(Comparator.comparing(Pais::getPoblacion).reversed())
                .forEach(pais -> System.out.println(pais.getNombre() +" " +  pais.getPoblacion()));

        /*- Muestra las capitales de todos los países ordenadas alfabéticamente*/
        System.out.println("Ordenar ciudades alfabeticamente:");
        paises.stream()
                .map(pais -> pais.getCapital())
                .sorted(Comparator.comparing(pais -> pais.getNombre()))
                .forEach(pais-> System.out.println(pais.getNombre()));
    }
}
