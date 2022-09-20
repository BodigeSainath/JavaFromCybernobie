package demo.employeeloan;

public abstract class Employee {
    protected int empId;
    protected String empName;
    protected double sal;

    public Employee(int empId, String empName, double sal) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    public abstract void calculateSalary();

}
