package org.kpp;

public class Main {
    public static void main(String[] args) {
        String str = "g5jngj14e34Fe45ffgdF76GBgt34mrt34tR";
        int upperCounter = 0, lowerCounter = 0, numberCounter = 0;
        char[] charsArray = str.toCharArray();

        for (int i = 0; i < charsArray.length; i++) {
            if (Character.isDigit(charsArray[i])) {
                numberCounter++;
            } else if (Character.isLetter(charsArray[i]) && Character.isLowerCase(charsArray[i])) {
                lowerCounter++;
            } else {
                upperCounter++;
            }
        }

        System.out.println("Counter of numbers is " + numberCounter);
        System.out.println("Counter of lowercase letters is " + lowerCounter);
        System.out.println("Counter of uppercase letters is " + upperCounter);
    }
}