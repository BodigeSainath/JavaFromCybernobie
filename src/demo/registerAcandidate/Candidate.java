package demo.registerAcandidate;

public class Candidate {
    private  String name,gender;
    private double exprectedSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getExprectedSalary() {
        return exprectedSalary;
    }

    public void setExprectedSalary(double exprectedSalary) throws InvalidSalaryException{
        if(exprectedSalary<10000) {
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000");
        }
        this.exprectedSalary = exprectedSalary;
    }
    public  Candidate(){

    }
    public Candidate(String name, String gender, double exprectedSalary) {
        this.name = name;
        this.gender = gender;
        this.exprectedSalary = exprectedSalary;
    }
}
