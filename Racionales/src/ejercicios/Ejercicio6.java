package ejercicios;

import modelo.Racional;

/**
 * Ejercicio6: prueba de simplificación y toString
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 */

// Uso: comprobar simplificación automática y toString
// Llamadas: new Racional(5,10)
public class Ejercicio6 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 6 ===");
        System.out.println(new Racional(5, 10)); // si simplifica, debe salir 1 / 2
    }
}