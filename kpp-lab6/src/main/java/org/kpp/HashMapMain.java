package org.kpp;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, Student> StudentsMap = new HashMap<>();

        StudentsMap.put("Ivan", new Student("Ivan", "Kukri", 15, 10, 10.4));
        StudentsMap.put("Jan", new Student("Jan", "Oil", 14, 9, 11.6));
        StudentsMap.put("Alex", new Student("Alex", "Rembo", 16, 11, 9.1));
        StudentsMap.put("Robert", new Student("Robert", "Ivan", 14, 9, 10.2));
        StudentsMap.put("NoName", new Student("NoName", "NoSurname", 0, 0, 0));

        for(Student i : StudentsMap.values()) {
            System.out.printf("Student %1$s %2$s is in HashMap\n", i.getName(), i.getSurname());
        }

        System.out.println("\nSize of list is " + StudentsMap.size());

        Student removedStudent = StudentsMap.remove("Ivan");
        if (removedStudent != null) {
            System.out.println(removedStudent.getName() + " was removed");
        } else {
            System.out.println("No student with name Ivan found to remove.");
        }

        boolean isNoNameRemoved = StudentsMap.remove("NoName") != null;
        System.out.println("Is NoName removed? " + isNoNameRemoved);

    }
}
