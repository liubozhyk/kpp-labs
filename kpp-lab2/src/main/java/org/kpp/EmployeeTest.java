package org.kpp;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Employee firstEmployee = new Employee("Ivan", "Ivanov", 12);
        Employee secondEmployee = new Employee("Sergiy", "Schneider");

        System.out.printf("\nFirst employee is %1$s %2$s and his yearly is %3$2.2f dollars.", firstEmployee.getName(),firstEmployee.getSurname(),firstEmployee.getMonthlySalary() * 12);
        System.out.printf("\nSecond employee is %1$s %2$s and his yearly is %3$2.2f dollars.", secondEmployee.getName(),secondEmployee.getSurname(),secondEmployee.getMonthlySalary() * 12);

        firstEmployee.setMonthlySalary(firstEmployee.getMonthlySalary() * 0.1);
        secondEmployee.setMonthlySalary(secondEmployee.getMonthlySalary() * 0.1);

        System.out.printf("\nFirst employee is %1$s %2$s and his yearly is %3$2.2f dollars.", firstEmployee.getName(),firstEmployee.getSurname(),firstEmployee.getMonthlySalary() * 12);
        System.out.printf("\nSecond employee is %1$s %2$s and his yearly is %3$2.2f dollars.", secondEmployee.getName(),secondEmployee.getSurname(),secondEmployee.getMonthlySalary() * 12);
    }
}