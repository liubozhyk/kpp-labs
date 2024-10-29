package org.kpp;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int[] arrayA = {2,4,5,1,7};
        int[] arrayB = {6,3,9,1,4};

        for (int i = 0; i < arrayA.length; i++) {
            sum += arrayA[i] - arrayB[i];
            }
        System.out.println("Sum by using formula equals: " + sum);
    }
}