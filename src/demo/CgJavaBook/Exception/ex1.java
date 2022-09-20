package demo.CgJavaBook.Exception;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws UserDefinedException {
        Scanner scanner=new Scanner(System.in);
        int age= scanner.nextInt();
       if(age<18) {
           throw new UserDefinedException("voting eligible for 18 above nly");
       }else {
           System.out.println("Voting completed");
       }
    }
}
