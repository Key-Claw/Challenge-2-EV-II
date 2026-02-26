package ejercicios;

import modelo.Racional;

/**
 * Ejercicio9: constructor con entero y representación de enteros negativos
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 */

// Uso: constructor con entero (entero/1) y representación de enteros negativos
// Llamadas: new Racional(-42)
public class Ejercicio9 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 9 ===");
        Racional r = new Racional(-42);
        System.out.println("new Racional(-42) -> " + r); // esperado: -42
    }
}