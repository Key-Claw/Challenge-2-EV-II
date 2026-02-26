package app;

import java.util.Scanner;
import ejercicios.Ejercicio1;
import ejercicios.Ejercicio2;
import ejercicios.Ejercicio3;
import ejercicios.Ejercicio4;
import ejercicios.Ejercicio5;
import ejercicios.Ejercicio6;
import ejercicios.Ejercicio7;
import ejercicios.Ejercicio8;
import ejercicios.Ejercicio9;
import ejercicios.Ejercicio10;
import ejercicios.Ejercicio11;
import ejercicios.Ejercicio12;
import ejercicios.Ejercicio13;

/**
 * Main del proyecto Racionales.
 * Presenta un menú para ejecutar los ejercicios que demuestran la clase Racional.
 * Autores: Raul y Cristian (DAW 1 - 2º trimestre)
 * Propósito: ejecutar de forma interactiva cada ejercicio y mostrar resultados por consola.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Permite ejecutar directamente un ejercicio pasando su número como argumento: java app.Main 3
        if (args != null && args.length > 0) {
            try {
                int op = Integer.parseInt(args[0]);
                runExercise(op);
            } catch (NumberFormatException e) {
                System.out.println("Argumento inválido. Debe ser un número de ejercicio (1-13). Mostrando menú.");
            }
        }

        String line;
        do {
            printMenu();
            System.out.print("Opción: ");
            line = sc.nextLine();
            if (line == null) break;
            line = line.trim();
            if (line.isEmpty()) continue;

            if (line.equalsIgnoreCase("x")) {
                runAll();
                continue;
            }

            int op;
            try {
                op = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduce un número del 0 al 13, o 'X' para ejecutar todo.");
                continue;
            }

            if (op == 0) {
                System.out.println("Saliendo...");
                break;
            }

            runExercise(op);

        } while (true);

        sc.close();
    }

    // Imprime el menú de forma centralizada
    private static void printMenu() {
        String[] items = new String[] {
                "X) Todos","0) Salir","1) Ejercicio 1","2) Ejercicio 2","3) Ejercicio 3","4) Ejercicio 4","5) Ejercicio 5",
                "6) Ejercicio 6","7) Ejercicio 7","8) Ejercicio 8","9) Ejercicio 9","10) Ejercicio 10",
                "11) Ejercicio 11","12) Ejercicio 12","13) Ejercicio 13"
        };
        int cols = 3; // queremos 3 columnas
        int n = items.length;
        int rows = (n + cols - 1) / cols; // ceil(n/cols)

        // calcular ancho máximo de celda
        int maxLen = 0;
        for (String it : items) if (it.length() > maxLen) maxLen = it.length();
        int cellWidth = maxLen;

        // calcular longitud total de una fila: '|' + cols*(" " + cell + " |")
        int rowLen = 1 + cols * (cellWidth + 3);
        String border = "+" + "-".repeat(rowLen - 2) + "+";

        // título centrado dentro del recuadro
        String title = "MENÚ DE EJERCICIOS";
        int innerWidth = rowLen - 2; // ancho disponible entre los '|'

        System.out.println(border);
        // línea del título centrado
        System.out.println("|" + padCenter(title, innerWidth) + "|");
        // línea separadora bajo el título
        System.out.println("|" + "-".repeat(innerWidth) + "|");

        for (int r = 0; r < rows; r++) {
            StringBuilder rowSb = new StringBuilder();
            rowSb.append('|');
            for (int c = 0; c < cols; c++) {
                int idx = c * rows + r; // distribución por columnas
                String cell = idx < n ? items[idx] : "";
                rowSb.append(' ').append(padRight(cell, cellWidth)).append(" |");
            }
            System.out.println(rowSb);
        }
        System.out.println(border);
    }

    // rellena a la derecha hasta width
    private static String padRight(String s, int width) {
        if (s == null) s = "";
        int len = s.length();
        if (len >= width) return s;
        return s + " ".repeat(width - len);
    }

    // centra una cadena dentro de un ancho dado (rellena con espacios)
    private static String padCenter(String s, int width) {
        if (s == null) s = "";
        if (s.length() >= width) return s;
        int total = width - s.length();
        int left = total / 2;
        int right = total - left;
        return " ".repeat(left) + s + " ".repeat(right);
    }

    // Ejecuta un ejercicio por número; captura excepciones para que el menú siga disponible
    private static void runExercise(int op) {
        try {
            switch (op) {
                case 1 -> Ejercicio1.ejecutar();
                case 2 -> Ejercicio2.ejecutar();
                case 3 -> Ejercicio3.ejecutar();
                case 4 -> Ejercicio4.ejecutar();
                case 5 -> Ejercicio5.ejecutar();
                case 6 -> Ejercicio6.ejecutar();
                case 7 -> Ejercicio7.ejecutar();
                case 8 -> Ejercicio8.ejecutar();
                case 9 -> Ejercicio9.ejecutar();
                case 10 -> Ejercicio10.ejecutar();
                case 11 -> Ejercicio11.ejecutar();
                case 12 -> Ejercicio12.ejecutar();
                case 13 -> Ejercicio13.ejecutar();
                default -> System.out.println("Opción inválida: " + op + ". Introduce un número entre 1 y 13.");
            }
        } catch (Exception e) {
            System.out.println("Error al ejecutar el ejercicio " + op + ": " + e.getClass().getSimpleName() + " - " + e.getMessage());
            // Para depuración más detallada, descomenta la siguiente línea:
            // e.printStackTrace();
        }
    }

    // Ejecuta todos los ejercicios de 1 a 13 (cada uno en su propio bloque try/catch)
    private static void runAll() {
        System.out.println("--- Ejecutando todos los ejercicios ---");
        for (int i = 1; i <= 13; i++) {
            System.out.println("\n--- Ejercicio " + i + " ---");
            runExercise(i);
        }
        System.out.println("--- Fin de todos los ejercicios ---");
    }
}