package demo.employeeloan;

public class Loan {
    public double calculateLoanAmount(Employee employeeObj){
        double loan=0;
        if(employeeObj instanceof  PermanentEmployee){
            loan= employeeObj.getSal()*15/100;
            return  loan;
        }else if(employeeObj instanceof TemporaryEmployee){
            loan=employeeObj.getSal()*10/100;
            return loan;
        }
        return  loan;
    }
}
