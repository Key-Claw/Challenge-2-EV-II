package ejercicios;

import modelo.Racional;

/**
 * Ejercicio11: simplificación automática en constructor
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 */

public class Ejercicio11 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 11 ===");
        Racional r = new Racional(12, 18);
        System.out.println("12/18 simplificado -> " + r); // esperado: 2 / 3
    }
}