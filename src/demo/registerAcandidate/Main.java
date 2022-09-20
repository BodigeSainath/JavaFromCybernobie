package demo.registerAcandidate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidSalaryException {
      try {

          Candidate candidate = getCandidateDetails();
          System.out.println("Registration success");
      }
      catch (InvalidSalaryException e){
          System.out.println(e.getMessage());
      }

    }

    public static Candidate getCandidateDetails() throws InvalidSalaryException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate Details");
        System.out.println("Name");
        String n = sc.next();
        System.out.println("Gender");
        String g = sc.next();
        System.out.println("Expected salary");
        double s = sc.nextDouble();
        if (s < 10000)
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000");
        else {
            Candidate c = new Candidate();
            c.setName(n);
            c.setGender(g);
            c.setExprectedSalary(s);

        return c;
    }
    }

}
