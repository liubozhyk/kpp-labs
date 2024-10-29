package org.kpp;

public class SecondMain {
    public static void main(String[] args) {
        int x = 5;
        double result = 1.0;
        for (int i = 1; i <= x; i++) {
            result *= (i / (i + 1.0) - Math.pow(Math.cos(Math.abs(x)), i));
        }
        System.out.printf("Result = %1$2.6f", result);
    }
}
