package Model;

import controller.EmployeeController;

import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private static Scanner sc=new Scanner(System.in);

    public Employee() {
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String name, int age, int salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " " + name + " " + " " + age + " " + salary;
    }
}

