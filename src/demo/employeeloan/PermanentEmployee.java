package demo.employeeloan;

public class PermanentEmployee extends Employee {
    private double basicPay;

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public PermanentEmployee(int empId,String empName,double basicPay){
        super(empId,empName);
        this.basicPay=basicPay;
    }

    @Override
    public void calculateSalary() {
        double pfAmount = basicPay * 0.12;
        double salary = basicPay - pfAmount;
        setSal(salary);
    }

}
