package ejercicios;

import modelo.Racional;

/**
 * Ejercicio3: crear un Racional y mostrarlo
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 */

// Uso: creación de un racional con constructor p/q
// Llamadas: new Racional(3,7)
public class Ejercicio3 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 3 ===");
        Racional r = new Racional(3, 7);
        System.out.println("Racional creado: " + r);
    }
}