package demo.Advance.java.persistemployee;

import java.io.*;
import java.util.ArrayList;

public class EmployeeUtility {
    public boolean addEmployee(String fileName, ArrayList<Employee> employeeList){
       try {
           FileOutputStream fileOutputStream=new FileOutputStream(fileName);
           ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
           objectOutputStream.writeObject(employeeList);
           return true;
       } catch (IOException e) {
           e.printStackTrace();
       }
       return false;
    }
    public Employee viewEmployeeById(String fileName, int employeeId) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Employee> employees = (ArrayList<Employee>) objectInputStream.readObject();
            for (Employee e : employees){
                if(e.geteId()==employeeId){
                    return e;
                }

            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
return null;
    }
}
