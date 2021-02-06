//package controller;
//
//
//import Model.Employee;
//import view.EmployeeView;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class ProjectController
//{
//    private static ProjectE employee=new Employee();
//    private static ProjectEView employeeView=new EmployeeView();
//    Map<Integer, Employee> create=new HashMap<>();
//    Scanner sc=new Scanner(System.in);
//    public void AskUserEmployeeDetails(int numberofemployee)
//    {
//        int i;
//        for (i = 0; i < numberofemployee; i++)
//        {
//            System.out.println("Enter employee Name");
//            employee.setName(sc.next());
//            System.out.println("Enter employee Age");
//            employee.setAge(sc.nextInt());
//            System.out.println("Enter employee Salary");
//            employee.setSalary(sc.nextInt());
//            employee=new Employee(employee.getName(), employee.getAge(),employee.getSalary());
//            createEmployee(i,employee);
//        }
//        listEmployee();
//
//    }
//
//    public void createEmployee(int i, Employee employee)
//    {
//        System.out.println("Employee created  =  "+employee);
//        create.put(i, employee);
//    }
//    public void listEmployee(){
//        System.out.println("Successfully Created Employee's = "+create.entrySet());
//        for (Map.Entry<Integer, Employee> entry : create.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//        EmployeeView.menuProvider();
//    }
//
//
//    public void deleteEmployee(int employeeKey)
//    {
//        create.remove(employeeKey);
//    }
//    public void updateEmployee(){
//
//
//    }
//
//}
