package ejercicios;

import modelo.Racional;

/**
 * Ejercicio12: sumar y comprobar simplificación tras operaciones sucesivas
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 */

public class Ejercicio12 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 12 ===");

        Racional r = new Racional(2, 6);     // 1/3
        r.sum(new Racional(1, 3));           // 1/3 + 1/3 = 2/3
        System.out.println("Resultado -> " + r + " (debería ser 2 / 3)");
    }
}