package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, options;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wartosc a: ");
        a = in.nextInt();
        System.out.println("Podaj wartosc b: ");
        b = in.nextInt();
        System.out.println("Wprowadzone wartości to: " + a + " oraz " + b + ".");
        NWD n = new NWD();
                System.out.println("Najwiekszy wspolny dzielnik to: " + n.greatestCommonDivisor(a,b) + ".");
                System.out.println("Najmniejsza wspolna wielokrotnosc to: " + (a*b)/n.greatestCommonDivisor(a,b));
    }
}
