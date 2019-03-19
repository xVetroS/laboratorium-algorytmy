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
        Scanner menu = new Scanner(System.in);
        System.out.println("Wybierz opcje: ");
        System.out.println("1) NWD");
        System.out.println("2) NWW");
        options = menu.nextInt();
        NWD n = new NWD();
        switch(options)
        {
            case 1:
                System.out.println("Najwiekszy wspolny dzielnik to: " + n.greatestCommonDivisor(a,b) + "."); break;
            case 2:
                System.out.println("Najmniejsza wspolna wielokrotnosc to: " + (a*b)/n.greatestCommonDivisor(a,b)); break;
            default:
                System.out.println("Nie ma takiej opcji w systemie!");
        }
    }
}
