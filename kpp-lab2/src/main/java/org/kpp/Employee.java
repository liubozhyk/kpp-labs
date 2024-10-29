package org.kpp;

public class Employee {
    private String name;
    private String surname;
    private double monthlySalary;

    public Employee(String name, String surname, double monthlySalary) {
        this.name = name;
        this.surname = surname;
        this.monthlySalary = monthlySalary;
    }
    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.monthlySalary = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
