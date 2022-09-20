package demo.Advance.java.persistemployee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Main implements Serializable {
    public static void main(String[] args) {
        Employee e=new Employee(1,"sai",1);
        Employee e1=new Employee(2,"nand",1);
        ArrayList<Employee> employee=new ArrayList<>(Arrays.asList(
                e,e1
        ));
        EmployeeUtility employeeUtility=new EmployeeUtility();
        employeeUtility.addEmployee("demo.txt",employee);
        Employee ee  =employeeUtility.viewEmployeeById("demo.txt",1);
        System.out.println(ee.getEname());
    }
}
