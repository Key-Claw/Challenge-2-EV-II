package ejercicios;

import modelo.Racional;

/**
 * Ejercicio7: probar res, mul y div
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 */

// Uso: probar restas, multiplicaciones y divisiones mutadoras
// Llamadas: new Racional(3,4).res(new Racional(1,6)), new Racional(2,5).mul(new Racional(3,4)), new Racional(3,5).div(new Racional(2,7))
public class Ejercicio7 {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 7 ===");

        Racional a = new Racional(3, 4);
        a.res(new Racional(1, 6));
        System.out.println("3/4 - 1/6 = " + a);

        Racional b = new Racional(2, 5);
        b.mul(new Racional(3, 4));
        System.out.println("2/5 * 3/4 = " + b);

        Racional c = new Racional(3, 5);
        c.div(new Racional(2, 7));
        System.out.println("3/5 / 2/7 = " + c);
    }
}