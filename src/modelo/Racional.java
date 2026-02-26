package modelo;

/**
 * Racional: representa num/den.
 *
 * Uso (ejemplos):
 *   Racional r = new Racional(3, 4);   // p/q
 *   Racional s = new Racional(5);      // entero -> 5/1
 *   r.sum(s); r.res(new Racional(1,2)); r.mul(new Racional(2,3)); r.div(new Racional(1,3));
 *
 * API (firma rápida):
 *   Racional(int num, int den)
 *   Racional(int entero)
 *   void sum(Racional), void res(Racional), void mul(Racional), void div(Racional)
 *   void sum(int), void res(int), void mul(int), void div(int)
 *   void sum(Racional, Racional)
 *
 * Usado en ejercicios (resumen muy corto):
 *   Ej1: operaciones básicas (sum,res,mul,div)
 *   Ej2: uso básico y toString
 *   Ej3/Ej4: constructor p/q
 *   Ej5: efecto mutador (sum cambia this)
 *   Ej6: simplificación automática y toString
 *   Ej7: res/mul/div ejemplos
 *   Ej8: encadenamiento de operaciones (castillo)
 *   Ej9: constructor con entero (entero/1)
 *   Ej10: normalización 0/1 y denominador negativo
 *   Ej11: simplificación en constructor
 *   Ej12: acumulación y simplificación en operaciones sucesivas
 *   Ej13: sobrecargas y sumas múltiples / con enteros
 *
 * Notas: normaliza y simplifica en constructor y tras cada operación;
 *        lanza IllegalArgumentException si den == 0;
 *        lanza ArithmeticException al dividir por un racional con num == 0.
 *
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 */
public class Racional {

    // Numerador y denominador (estado del objeto)
    private int num;
    private int den;

    // Constructor p/q: valida den != 0 y simplifica
    public Racional(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0");
        }
        this.num = num;
        this.den = den;
        simpl(); // dejar siempre simplificado
    }

    // Constructor entero: entero/1
    public Racional(int entero) {
        this.num = entero;
        this.den = 1;
    }

    // Suma mutadora: this = this + r
    public void sum(Racional r) {
        this.num = this.num * r.den + r.num * this.den;
        this.den = this.den * r.den;
        simpl();
    }

    // Resta mutadora
    public void res(Racional r) {
        this.num = this.num * r.den - r.num * this.den;
        this.den = this.den * r.den;
        simpl();
    }

    // Multiplicación mutadora
    public void mul(Racional r) {
        this.num = this.num * r.num;
        this.den = this.den * r.den;
        simpl();
    }

    // División mutadora (lanza si r.num == 0)
    public void div(Racional r) {
        if (r.num == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        this.num = this.num * r.den;
        this.den = this.den * r.num;
        simpl();
    }

    // Representación legible: entero si den==1, si no "num / den"
    @Override
    public String toString() {
        if (den == 1) return String.valueOf(num);
        return num + " / " + den;
    }

    // Normaliza y simplifica en sitio
    public void simpl() {
        if (num == 0) {
            den = 1;
            return;
        }
        if (den < 0) {
            num = -num;
            den = -den;
        }
        int mcd = mcd(Math.abs(num), den);
        num /= mcd;
        den /= mcd;
    }

    // MCD por Euclides
    private int mcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return (a == 0) ? 1 : a;
    }

    // Sobrecargas para mayor usabilidad (delegan a las versiones con Racional)
    public void sum(int entero) { sum(new Racional(entero)); }
    public void res(int entero) { res(new Racional(entero)); }
    public void mul(int entero) { mul(new Racional(entero)); }
    public void div(int entero) {
        if (entero == 0) throw new ArithmeticException("No se puede dividir entre 0");
        div(new Racional(entero));
    }

    // Sumar tres racionales: this = this + r1 + r2
    public void sum(Racional r1, Racional r2) {
        sum(r1);
        sum(r2);
    }
}