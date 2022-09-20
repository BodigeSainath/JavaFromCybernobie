package demo.CgJavaBook.Exception.ex2;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fname,last;
        System.out.println("Enter fname");
        fname= sc.next();
        if(fname.equals('\n')){
            System.out.println("null");
        }
        System.out.println("Enter lname");
        last=sc.next();
    }
}
