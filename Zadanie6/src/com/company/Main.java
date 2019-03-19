package com.company;


import java.util.Random;
import java.util.Scanner;

import static com.company.Tablica.*;

public class Main {

    public static void main(String[] args) {
        int rozmiar, wybor, zakres;
        Scanner wprowadz = new Scanner(System.in);
        Tablica tab = new Tablica();
        System.out.println("Podaj rozmiar tablicy: ");
        rozmiar = wprowadz.nextInt();
        int tablica[] = new int[rozmiar];
        System.out.println("Utworzono tablice o rozmiarze: " + rozmiar + ".");
        System.out.println("Chcesz wypelnic tablice losowymi liczbami czy wolisz je uzupelnic sam?");
        System.out.println("1) Wprowadz losowe liczy do tablicy.");
        System.out.println("2) Pragne uzupelnic swoja tablice wlasnymi liczbami.");
        wybor = wprowadz.nextInt();
        switch(wybor) {
            case 1: System.out.println("Liczby losowe zostaly wlasnie wprowadzone do twojej tablicy! ");
            Random random = new Random();
            System.out.println("Podaj zakres liczb do wprowadzenia: ");
                zakres = wprowadz.nextInt();
            for(int x=0; x<tablica.length; x++)
            {
                tablica[x] = random.nextInt(zakres);
            }
                System.out.println("Tablica zostala wypelniona losowymi elementami z zakresu: [0-"+zakres+"].");
                for(int y=0; y<tablica.length; y++)
                {
                    System.out.print("Element["+y+"] = " + "["+tablica[y]+"]" + " ");
                }
            break;
            case 2: System.out.println("Teraz mozesz wprowadzic swoje liczby do tablicy");
                for(int i=0; i<tablica.length; i++) {
                    tablica[i] = wprowadz.nextInt();
                }
                System.out.println("Tablica zostala wypelniona wlasnymi elementami: ");
                for(int j=0; j<tablica.length; j++)
                {
                    System.out.print("Element["+j+"] = " + "["+tablica[j]+"]" + " ");
                }
            break;
            default:
                System.out.println("Nie mozesz wykonac tego dzialania, nie ma takiej opcji");
        }
        System.out.println(" ");
        System.out.println("Maksymalna wartość: " + maxValue(tablica) + ".");
        System.out.println("Minimalna wartość: " + minValue(tablica) + ".");
        System.out.println("Średnia wartość elementów tablicy: " + srValue(tablica) + ".");
        System.out.println("Rozrzut wartości: "+ Tablica.rozrzutValue(tab.maxValue(tablica),tab.minValue(tablica))+ ".");
        System.out.println("Suma elementów: "+ sumaValue(tablica)+ ".");
        System.out.println("Wariancja " + variance(tablica)+".");
        System.out.println("Odchylenie standardowe: " + standard(variance(tablica)));
        System.out.println("Ostatni element tablicy posiada wartość: "+tablica[rozmiar-1] + ".");
        System.out.println("Ile jest elementow podzielnych przez 3? Odpowiedź: " + elements(tablica));






    }
}
