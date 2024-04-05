package SegundaEvaluacionProgramacion.ahorcado;

public class TestAhorcado {
    public static void main(String[] args) {
        Ahorcado juego = new Ahorcado();
        System.out.println("Palabra a adivinar: " + juego.getPalabraIntentada());

        // Simula intentos del jugador (puedes modificar esto según tus necesidades)
        juego.intentarLetra('a');
        juego.intentarLetra('o');
        juego.intentarLetra('e');
        juego.intentarLetra('c');

        System.out.println("Palabra intentada: " + juego.getPalabraIntentada());
        System.out.println("Fallos: " + juego.getNumFallos());

        if (juego.adivinoPalabra()) {
            System.out.println("¡Has ganado!");
        } else {
            System.out.println("¡Sigue intentándolo!");

        }
    }
}