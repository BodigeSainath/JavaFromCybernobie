package demo.averageandgrade;

import java.util.Scanner;

public class StudentMain  extends Student{


    public static Student getStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id");

        int sid = sc.nextInt();
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter no of subject");
        int sub=sc.nextInt();
        while(true){
            if(sub<=0){
                System.out.println("Invalid no of subjects");
            }else
                break;
        }
        System.out.println("Enter marks secured");
        int marks[]=new int[sub];
        for(int i=0;i<marks.length;i++){
           int mark=0;
           while(true){
               System.out.println("Enter marks secured in "+(i+1)+" subject ");
               mark=sc.nextInt();
               if(mark<0 || mark >100){
                   System.out.println("Enter Valid marks ");
               }else
                   break;
               marks[i]=mark;
           }
        }
        Student s=new Student(sid,name,marks);
return  s;
    }


    public static void main(String[] args) {
    Student s=new Student();
    getStudentDetails();
    s.calculateAvg();
    s.findGrade();
    s.display();
    }
}