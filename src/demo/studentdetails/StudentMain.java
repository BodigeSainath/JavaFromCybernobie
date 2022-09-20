package demo.studentdetails;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id");
        int id=sc.nextInt();
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Enter address");
        String add=sc.next();
        System.out.println("Whether student from NIT(y/n)");
        String nit=sc.next();
        if(nit.equals("NO")){
            System.out.println("Enter college name");
            String clg=sc.next();
            Student s=new Student(id,name,add,clg);
            s.showNo();
        }else if(nit.equals("YES")){
            Student s=new Student(id,name,add);
            s.showYes();
        }

    }
}
