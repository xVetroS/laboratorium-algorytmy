package com.company;

public class Silnia {
    public static int silniaRekurencyjna(int a){
        if(a <= 1){
            return 1;
        }
        return a*silniaRekurencyjna(a-1);
    }

    public static int silniaIteracyjnie(int a)
    {
        int i = 0;
        int wynik = 1;
        while(i<a){
            i++;
            wynik = wynik * i;
        }
        return wynik;
    }
}
