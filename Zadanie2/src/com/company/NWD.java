package com.company;

public class NWD {
    public double greatestCommonDivisor(int a, int b){
        while(a!=b) {
            if (a > b) {
                a = a - b;
                return a;
            } else
                b = b - a;
        }
        return a;
    }
}
