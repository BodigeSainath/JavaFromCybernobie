package demo.employeeloan;

public class TemporaryEmployee extends Employee{
    private int hoursWorked,hourlyWages;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyWages() {
        return hourlyWages;
    }

    public void setHourlyWages(int hourlyWages) {
        this.hourlyWages = hourlyWages;
    }
    public TemporaryEmployee(int empId,String empName,int hoursWorked, int hourlyWages){
        super(empId,empName);
        this.hoursWorked=hoursWorked;
        this.hourlyWages=hourlyWages;
    }

    @Override
    public void calculateSalary() {
        sal=hoursWorked*hourlyWages;
        setSal(sal);
    }
}
