package controller;

import Model.Employee;
import Model.EmployeeService;
import repo.StoreEmployee;
import view.EmployeeView;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeController
{
    private static Employee employee=new Employee();
    private static final EmployeeView employeeView=new EmployeeView();
    EmployeeService employeeService=new EmployeeService();
    StoreEmployee store=new StoreEmployee();
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
            employeeService.createEmployee(i,employee);

        }
//        EmployeeView.menuProvider();
        store.displayEmployee();
        employeeService.listEmployee();

    }








}
