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
				System.out.println(liczba + "! = " + silniaRekurencyjna(liczba) + " rekurencja.");
				System.out.println(liczba + "! = " + silniaIteracyjnie(liczba) + " iteracja.");

    }
}
