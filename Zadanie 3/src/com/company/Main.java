package com.company;

import java.util.Scanner;

import static com.company.Silnia.silniaIteracyjnie;
import static com.company.Silnia.silniaRekurencyjna;


public class Main {

    public static void main(String[] args) {
	    int liczba, opcja;
	    Scanner wprowadz = new Scanner(System.in);
	    System.out.println("Wprowadz liczbe: ");
	    liczba = wprowadz.nextInt();
	    System.out.println("Liczona bedzie silnia z liczby: " + liczba + ".");
	    System.out.println("Wprowadz liczbe aby wybrac sposob liczenia silni!");
	    opcja = wprowadz.nextInt();
	    System.out.println("1) Rekurencyjnie.");
	    System.out.println("2) Iteracyjnie.");
	    switch(opcja)
		{
			case 1:
				System.out.println("Silnia z liczby: " + liczba + " zostanie wyliczona rekurencyjnie!");
				System.out.println(liczba + "! = " + silniaRekurencyjna(liczba) + ".");
				break;
			case 2: System.out.println("Silnika z liczby: " + liczba + " zostanie wyliczona iteracyjnie! ");
			System.out.println(liczba + "! = " + silniaIteracyjnie(liczba) + ".");
			break;
			default:
				System.out.println("Nie ma takowej opcji!");
				break;
		}

    }
}
