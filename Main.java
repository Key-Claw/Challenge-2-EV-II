public class Main {
    public static void main(String[] args) {
        Racional a = new Racional(1, 2);
        Racional b = new Racional(1, 3);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + a.suma(b));
        System.out.println("a - b = " + a.resta(b));
        System.out.println("a * b = " + a.multiplicacion(b));
        System.out.println("a / b = " + a.division(b));

        Racional c = new Racional(4, 6);
        System.out.println("\nc = 4/6 simplificado = " + c);

        Racional d = new Racional(3, 4);
        Racional e = new Racional(2, 4);
        System.out.println("\nd = " + d);
        System.out.println("e = 2/4 simplificado = " + e);
        System.out.println("d + e = " + d.suma(e));
        System.out.println("d - e = " + d.resta(e));
        System.out.println("d * e = " + d.multiplicacion(e));
        System.out.println("d / e = " + d.division(e));
    }
}
