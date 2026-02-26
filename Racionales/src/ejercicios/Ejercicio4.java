package ejercicios;

import modelo.Racional;

/**
 * Ejercicio4: muestra la creación de un Racional p/q
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 */

// Uso: ejemplo directo de constructor y salida por consola
// Llamadas: new Racional(1,4)
public class Ejercicio4 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 4 ===");
        Racional r = new Racional(1, 4);
        System.out.println("new Racional(1,4) -> " + r);
    }
}