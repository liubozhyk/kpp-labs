package org.kpp;

public class Main{
    public static void main(String[] args) {
        // Get NullPointerException

        try {
            String str = null;
            System.out.println(str.contains("a"));
        } catch (NullPointerException e) {
            System.out.println(e.getClass());
        }

        // Get CloneNotSupportedException

        Main obj = new Main();
        try {
            Main clonedObj = (Main) obj.clone(); // Спроба клонування
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getClass());
        }
    }
}