package SegundaEvaluacionProgramacion.ahorcado;

import java.util.Random;

public class Ahorcado {
    private static final String[] palabras = {"casa", "coche", "perro", "gato", "ordenador"};
    private String palabraAdivinar;
    private String palabraIntentada;
    private int numFallos;

    public Ahorcado() {
        // Inicializa la palabra a adivinar de forma aleatoria
        Random random = new Random();
        palabraAdivinar = palabras[random.nextInt(palabras.length)];
        palabraIntentada = "_".repeat(palabraAdivinar.length());
        numFallos = 0;
    }

    public String getPalabraIntentada() {
        return palabraIntentada;
    }

    public int getNumFallos() {
        return numFallos;
    }

    public boolean intentarLetra(char letra) {
        boolean acierto = false;
        StringBuilder nuevaPalabraIntentada = new StringBuilder(palabraIntentada);

        for (int i = 0; i < palabraAdivinar.length(); i++) {
            if (palabraAdivinar.charAt(i) == letra) {
                nuevaPalabraIntentada.setCharAt(i, letra);
                acierto = true;
            }
        }

        if (!acierto) {
            numFallos++;
        }

        palabraIntentada = nuevaPalabraIntentada.toString();
        return acierto;
    }

    public boolean adivinoPalabra() {
        return palabraIntentada.equals(palabraAdivinar);
    }
}

