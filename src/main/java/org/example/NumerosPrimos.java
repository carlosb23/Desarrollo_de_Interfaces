package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class NumerosPrimos {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Buscador de Primos");
        System.out.println("==================");
        int inicio;
        int fin = 0;
        int contador = 0;

        Scanner sc = new Scanner(System.in);
        inicio = sc.nextInt();

        if (inicio < 0) {
            System.out.println("Escribe el numero inicial (0 para salir): ");
        } else if (inicio == 0) {
            sc.close();
            return;
        }

        System.out.println("Escribe el numero final: ");
        fin = sc.nextInt();
        for (int x = inicio; x <= fin; x++) {
            if (esPrimo(x)) {
                contador++;
                System.out.print(String.valueOf(x) + ",");
            }
        }
        System.out.printf("\nTotal: %d", contador);
        sc.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
        }
    }