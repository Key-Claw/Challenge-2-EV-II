package ejercicios;

import modelo.Racional;

/**
 * Ejercicio8: ejemplo "castillo" que encadena operaciones
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 */

// Uso: encadenamiento de operaciones y división compuesta (ejemplo 'castillo')
// Llamadas: secuencia de new Racional(...) y llamadas a res(), sum(), mul(), div()
public class Ejercicio8 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 8 (CASTILLO) ===");

        Racional castillo;
        castillo = new Racional(3,5);
        castillo.res(new Racional(1,4));
        castillo.sum(new Racional(1,10));
        castillo.mul(new Racional(3,2));
        castillo.res(new Racional(1,5));

        Racional divisor;
        divisor = new Racional(2,6);
        divisor.sum(new Racional(1,3));
        divisor.res(new Racional(6,4));
        divisor.div(new Racional(2,3));
        divisor.sum(new Racional(1,6));

        castillo.div(divisor);

        System.out.println("Resultado castillo: " + castillo);
    }
}