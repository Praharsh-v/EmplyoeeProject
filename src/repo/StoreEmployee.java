package repo;

import Model.Employee;

import java.util.Collection;
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

    public void displayEmployee(){
        for (Map.Entry<Integer, Employee> entry : this.create.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

