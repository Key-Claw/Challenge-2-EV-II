package ejercicios;

import modelo.Racional;

/**
 * Ejercicio5: demuestra que sum muta el objeto y que la copia no cambia
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 */

// Uso: demostrar que las operaciones mutan el objeto receptor
// Llamadas: new Racional(2,6), new Racional(1,3), r1.sum(r2)
public class Ejercicio5 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 5 ===");
        Racional r1 = new Racional(2, 6);
        Racional r2 = new Racional(1, 3);

        r1.sum(r2); // r1 cambia, r2 no
        System.out.println("Resultado r1 (2/6 + 1/3) -> " + r1);
        System.out.println("r2 sigue siendo -> " + r2);
    }
}