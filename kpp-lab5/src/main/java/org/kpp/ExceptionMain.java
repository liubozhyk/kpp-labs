package org.kpp;

public class ExceptionMain {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Некоректний вік: " + age + ". Вік має бути в межах від 0 до 120.");
        } else {
            System.out.println("Вік прийнятний: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(150);
        } catch (InvalidAgeException e) {
            System.out.println("Виникла помилка: " + e.getMessage());
        }

        try {
            checkAge(30);
        } catch (InvalidAgeException e) {
            System.out.println("Виникла помилка: " + e.getMessage());
        }
    }
}
