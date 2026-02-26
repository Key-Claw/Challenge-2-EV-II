package ejercicios;

import modelo.Racional;

/**
 * Ejercicio2: uso básico de Racional y comprobación de toString
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 */

// Uso: crear racionales y comprobar toString / simplificación básica
// Llamadas: new Racional(1,4), new Racional(2,6), mini.sum(new Racional(1,3))
public class Ejercicio2 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 2 (Uso básico) ===");

        Racional r;
        r = new Racional(1, 4);
        System.out.println(r); // esperado: 1 / 4

        Racional mini;
        mini = new Racional(2, 6);
        mini.sum(new Racional(1, 3));
        System.out.println(mini); // esperado: 2 / 3
    }
}