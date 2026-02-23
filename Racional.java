public class Racional {
    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("El denominador no puede ser cero.");
        }
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
        int mcd = mcd(Math.abs(numerador), denominador);
        this.numerador = numerador / mcd;
        this.denominador = denominador / mcd;
    }

    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Racional suma(Racional otro) {
        long num = (long) this.numerador * otro.denominador + (long) otro.numerador * this.denominador;
        long den = (long) this.denominador * otro.denominador;
        return new Racional((int) num, (int) den);
    }

    public Racional resta(Racional otro) {
        long num = (long) this.numerador * otro.denominador - (long) otro.numerador * this.denominador;
        long den = (long) this.denominador * otro.denominador;
        return new Racional((int) num, (int) den);
    }

    public Racional multiplicacion(Racional otro) {
        long num = (long) this.numerador * otro.numerador;
        long den = (long) this.denominador * otro.denominador;
        return new Racional((int) num, (int) den);
    }

    public Racional division(Racional otro) {
        if (otro.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        long num = (long) this.numerador * otro.denominador;
        long den = (long) this.denominador * otro.numerador;
        return new Racional((int) num, (int) den);
    }

    @Override
    public String toString() {
        if (denominador == 1) {
            return String.valueOf(numerador);
        }
        return numerador + "/" + denominador;
    }
}
