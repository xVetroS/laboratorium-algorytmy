package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wpisz liczbę dla której program obliczy sumę cyfr");
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        double x = sc.nextInt();
        int wynik = 0;
        while (x != 0) {
            wynik += x%10;
            x /= 10;
        }
        System.out.println("Suma cyfr w podanej liczbie to : " + wynik);

    }
}