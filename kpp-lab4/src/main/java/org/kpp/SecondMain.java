package org.kpp;

import java.util.HashMap;
import java.util.Map;

public class SecondMain {
    public static void main(String[] args) {
        String text = "Hi. This is a new text to test.";
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int totalChars = text.length();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Символ\tЧастота\tВідносна частота");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char symbol = entry.getKey();
            int count = entry.getValue();
            double relativeFrequency = (double) count / totalChars;

            System.out.printf("%c\t\t%d\t\t%.4f%n", symbol, count, relativeFrequency);
        }
    }
}
