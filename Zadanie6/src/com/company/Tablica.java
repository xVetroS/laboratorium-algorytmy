package com.company;

public class Tablica {
    public static int maxValue(int tablica2[])
    {
        int a=0;
        for(int i=0; i< tablica2.length; i++)
        {
            if(tablica2[i]>a)
            {
                a=tablica2[i];
            }
        }
        return a;
    }

    public static int minValue(int tablica3[])
    {
        int a=999999999;
        for(int i=0; i< tablica3.length; i++)
        {
            if(tablica3[i]<a)
            {
                a=tablica3[i];
            }
        }
        return a;
    }

    public static int rozrzutValue(int max, int min)
    {
        int a = max-min;
        return a;
    }

    public static int sumaValue(int tablica4[])
    {
        int suma = 0;
        for(int i=0; i< tablica4.length; i++)
        {
            suma+=tablica4[i];
        }
        return suma;
    }

    public static double srValue(int tablicasr[])
    {
        int suma = 0;
        for(int i=0; i< tablicasr.length; i++)
        {
            suma+=tablicasr[i];
        }
        return suma / tablicasr.length;
    }

    public static double variance(int tablicav[])
    {
        double sr = srValue(tablicav);
        double sigma, sumka = 0;

        for(int i = 0; i < tablicav.length; i++){
            sumka += Math.pow((tablicav[i] - sr), 2);
        }
        sigma = sumka/tablicav.length;


        return sigma;
    }

    public static double standard(double variance1)
    {
        return Math.sqrt(variance1);
    }

    public static int elements(int tabe[])
    {
        int zmienna = 0;
        for(int i=0; i<tabe.length; i++)
            if(tabe[i]%3==0) zmienna+=1;
        return zmienna;
    }





}
