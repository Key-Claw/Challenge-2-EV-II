package ejercicios;

import modelo.Racional;

/**
 * Ejercicio10: normalización 0/1 y denominador negativo
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 */

public class Ejercicio10 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 10 ===");

        Racional cero = new Racional(0, 5);
        System.out.println("0/5 -> " + cero + " (debería ser 0)");

        Racional signo = new Racional(1, -2);
        System.out.println("1/-2 -> " + signo + " (debería ser -1 / 2)");

        // Descomenta para ver la excepción:
        // Racional mal = new Racional(1, 0);
    }
}