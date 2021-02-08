package view;

import Model.Employee;
import Model.EmployeeService;
import controller.EmployeeController;
import repo.StoreEmployee;

import java.util.Scanner;

public class EmployeeView {
    private static final EmployeeController ec = new EmployeeController();
    private static final Employee employee = new Employee();
    private static EmployeeService employeeService = new EmployeeService();
    private static StoreEmployee storeEmployee=new StoreEmployee();

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter system of below by chosing 1 and 2");
        menuProvider();
    }

    public static void menuProvider() {
        System.out.println("1.Employee");
        System.out.println("2.Project");
        int menuchoice = sc.nextInt();
        switch (menuchoice) {
            case 1:
                employeeMenu();
            case 2:
                projectMenu();
        }
    }

    public static void employeeMenu() {
        System.out.println("welcome to employee System");
        System.out.println("1.CreateEmployee");
        System.out.println("2.DeleteEmployee");
        System.out.println("3.UpdateEmployee");
        System.out.println("4.ListEmployee's");
        int employeechoice = sc.nextInt();
        employeeChoice(employeechoice);

    }

    public static void projectMenu() {
//        System.out.println("welcome to Project System");
//        System.out.println("1.Create Project");
//        System.out.println("2.Assign Project");
//        System.out.println("3.Delete Project");
//        System.out.println("4.List Projects");
//        int projectchoice = sc.nextInt();
//        projectChoice(projectchoice);
//
//    }
    }

        public static void employeeChoice ( int employeechoice){

            switch (employeechoice) {
                case 1:
                    System.out.println("How Many Number of Employess Do you Want to Create");
                    int numberofemployee = sc.nextInt();
                    ec.AskUserEmployeeDetails(numberofemployee);
                    break;
                case 2:
//                ec.listEmployee();
                    System.out.println("To Delete Employee Pls enter Employee key from the above available employee");
                    int employeeKey = sc.nextInt();
                    employeeService.deleteEmployee(employeeKey);
                    break;
                case 3:
                    System.out.println("Please Enter the Key they you have to update from above Employee list");
                    int key = sc.nextInt();
                    employeeService.updateEmployee(key);
                    break;
                case 4:
                    employeeService.listE();
                    break;
            }


        }

        public static void projectChoice ( int projectchoice){

//            switch (projectchoice) {
//                case 1:
//                    System.out.println("How Many Number of Projects Do you Want to Create");
//                    int numberofemployee = sc.nextInt();
//                    ec.AskUserEmployeeDetails(numberofemployee);
//                    break;
//                case 2:
//                    int key = 2;
//                    employeeService.listEmployee();
//                    System.out.println("To which Employee you want to assign projects from above available list of employee");
//                    int employeeKey = sc.nextInt();
//                    employeeService.deleteEmployee(employeeKey);
//                case 3:
//                    System.out.println("Which Employee do you want to update from above available list..?");
////                ec.updateEmployee();
//                case 4:
//                    System.out.println("To Update Employee Pls Enter details of employee to upadate");
//                    employeeService.listEmployee();
//            }
        }
    }

