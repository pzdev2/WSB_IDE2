package com.company;

import wsb.fib.Fibonacci;
import wsb.units.FibonacciFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj tryb liczenia (r|p) i indeks liczby w ciągu Fibonacciego, np. r7. Wyjście - q");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            FibonacciFactory factory = new FibonacciFactory(line);

            if (factory.mode == null) {
                System.out.println("Niepoprawne wejście! Spróbuj ponownie");
                continue;
            }

            if (factory.mode.equals(FibonacciFactory.QUIT_MODE)) {
                break;
            }

            Fibonacci fibonacci = factory.findProperFibonacci();
            System.out.println("WYNIK: " + fibonacci.findElement(factory.index));
        }

    }
}
