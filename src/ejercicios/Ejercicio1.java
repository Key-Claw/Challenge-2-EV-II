package ejercicios;

import modelo.Racional;

/**
 * Ejercicio1: demuestra las reglas algebraicas básicas con Racional
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 * Propósito: crear ejemplos y mostrar que sum/res/mul/div funcionan.
 */

// Uso: operaciones básicas (sum, res, mul, div) con Racional
// Llamadas: new Racional(1,2), new Racional(1,3), suma.sum(b), resta.res(d), multi.mul(f), divi.div(h)
public class Ejercicio1 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 1 (Reglas algebraicas) ===");

        // Ejemplo: 1/2 + 1/3 = 5/6
        Racional a = new Racional(1, 2);
        Racional b = new Racional(1, 3);

        Racional suma = new Racional(1, 2);
        suma.sum(b);

        System.out.println(a + " + " + b + " = " + suma);

        // Ejemplo: 3/4 - 1/6 = 7/12
        Racional c = new Racional(3, 4);
        Racional d = new Racional(1, 6);

        Racional resta = new Racional(3, 4);
        resta.res(d);

        System.out.println(c + " - " + d + " = " + resta);

        // Ejemplo: 2/5 * 3/4 = 3/10
        Racional e = new Racional(2, 5);
        Racional f = new Racional(3, 4);

        Racional multi = new Racional(2, 5);
        multi.mul(f);

        System.out.println(e + " * " + f + " = " + multi);

        // Ejemplo: 3/5 / 2/7 = 21/10
        Racional g = new Racional(3, 5);
        Racional h = new Racional(2, 7);

        Racional divi = new Racional(3, 5);
        divi.div(h);

        System.out.println(g + " / " + h + " = " + divi);
    }
}