package repo;

import Model.Employee;
import Model.EmployeeService;

import java.util.HashMap;
import java.util.Map;
public class StoreEmployee
{
    Map<Integer, Employee> create=new HashMap<>();

//    Store the values into Map...........................
    public void storeEmployee(int i,Employee employee){
       create.put(i, employee);
    }

    public Map<Integer, Employee> getCreate() {
        return create;
    }

    public void display(){
        EmployeeService ed=new EmployeeService();
        ed.displayEmployee(getCreate());
    }
    public Map<Integer, Employee> listEmployee(){
        return create;
    }


    }


