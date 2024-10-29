package org.kpp;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Student> StudentsLL = new LinkedList<>();

        Student Ivan = new Student("Ivan", "Kukri", 15, 10, 10.4);
        Student Jan = new Student("Jan", "Oil", 14, 9, 11.6);
        Student Alex = new Student("Alex", "Rembo", 16, 11, 9.1);
        Student Robert = new Student("Robert", "Ivan", 14, 9, 10.2);
        Student NoName = new Student("NoName", "NoSurname", 0, 0, 0);

        StudentsLL.add(Ivan);
        StudentsLL.add(Jan);
        StudentsLL.add(Alex);
        StudentsLL.add(Robert);
        StudentsLL.add(NoName);

        for(Student i : StudentsLL) {
            System.out.printf("Student %1$s %2$s is in ArrayList with index %3$d\n", i.getName(), i.getSurname(), StudentsLL.indexOf(i));
        }

        System.out.println();

        for(Student i : StudentsLL.reversed()) {
            System.out.printf("Student %1$s %2$s is in ArrayList with index %3$d\n", i.getName(), i.getSurname(), StudentsLL.indexOf(i));
        }

        System.out.println("First element of list: " + StudentsLL.getFirst().getName());
        System.out.println("Last element of list: " + StudentsLL.getLast().getName());
    }
}
