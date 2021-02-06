package controller;

import Model.Employee;
import view.EmployeeView;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeController
{
    private static Employee employee=new Employee();
    private static final EmployeeView employeeView=new EmployeeView();
    Map<Integer, Employee> create=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    public void AskUserEmployeeDetails(int numberofemployee)
    {
        int i;
        for (i = 0; i < numberofemployee; i++)
        {
            System.out.println("Enter employee Name");
            String name=sc.next();
            //employee.setName(sc.next());
            System.out.println("Enter employee Age");
            int age=sc.nextInt();
            //employee.setAge(sc.nextInt());
            System.out.println("Enter employee Salary");
            int salary=sc.nextInt();
            //employee.setSalary(sc.nextInt());
//            employee=new Employee(employee.getName(), employee.getAge(),employee.getSalary())
            employee=new Employee(name,age,salary);
            createEmployee(i,employee);
            System.out.println(employee.getName());
        }
        listEmployee();

    }

    public void createEmployee(int i, Employee employee)
    {
        System.out.println("Employee created  =  "+employee);
        create.put(i, employee);
    }
    public void listEmployee() {
        System.out.println("Created Employee's = ");
        for (Map.Entry<Integer, Employee> entry : create.entrySet()) {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
        EmployeeView.menuProvider();
        }


    public void deleteEmployee(int employeeKey)
    {
        create.remove(employeeKey);
        System.out.println("Remaining Employee's = ");
        for (Map.Entry<Integer, Employee> entry : create.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
       EmployeeView.menuProvider();
    }
    public void updateEmployee(int key){
        System.out.println("Please Enter Name, Age Salary to update");
        employee=new Employee(sc.next(),sc.nextInt(),sc.nextInt());
        create.put(key, employee);
        System.out.println("Updated Employee's = ");
        for (Map.Entry<Integer, Employee> entry : create.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        EmployeeView.menuProvider();
    }

}
