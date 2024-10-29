package org.kpp;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<Student> StudentsAL = new ArrayList<>();
        Student Ivan = new Student("Ivan", "Kukri", 15, 10, 10.4);
        Student Jan = new Student("Jan", "Oil", 14, 9, 11.6);
        Student Alex = new Student("Alex", "Rembo", 16, 11, 9.1);
        Student Robert = new Student("Robert", "Ivan", 14, 9, 10.2);
        Student NoName = new Student("NoName", "NoSurname", 0, 0, 0);

        StudentsAL.add(Ivan);
        StudentsAL.add(Jan);
        StudentsAL.add(Alex);
        StudentsAL.add(Robert);
        StudentsAL.add(NoName);

        for(Student i : StudentsAL) {
            System.out.printf("Student %1$s %2$s is in ArrayList with index %3$d\n", i.getName(), i.getSurname(), StudentsAL.indexOf(i));
        }

        System.out.println("\nSize of list is " + StudentsAL.size());
        System.out.println("Is student with name Ivan in this list? " + StudentsAL.contains(Ivan));
        System.out.println(StudentsAL.removeFirst().getName() + " was removed");
        System.out.println("Is NoName removed? " + StudentsAL.remove(NoName));
        StudentsAL.ensureCapacity(10);
        StudentsAL.trimToSize();
    }
}