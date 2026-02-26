package ejercicios;

import modelo.Racional;

/**
 * Ejercicio13: sobrecargas y suma con enteros
 * Autores: Alumno1 y Alumno2 (DAW 1 - 2º trimestre)
 */

public class Ejercicio13 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 13 ===");

        // Ejemplo: 2/6 + 1/3 + 6/4
        Racional r = new Racional(2, 6);
        r.sum(new Racional(1, 3), new Racional(6, 4));
        System.out.println("2/6 + 1/3 + 6/4 = " + r);

        // Ejemplo con enteros: 5 + 1/3
        Racional s = new Racional(1, 3);
        s.sum(5);
        System.out.println("1/3 + 5 = " + s);
    }
}