package demo.Advance.java.memberManipulation;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Member member=new Member();
        Library  library=new Library();
        while (true){
            System.out.println("1.Add Member\n" +
                    "2.View All Members\n" +
                    "3.Search Member by address\n" +
                    "4.Exit");
            System.out.println("Enter choice");
            int choice=sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Enter id");
                    int id=sc.nextInt();
                    System.out.println("Enter name");
                    String name= sc.next();
                    System.out.println("enter address");
                    String addr= sc.next();
                    member.setMemberId(id);
                    member.setMemberName(name);
                    member.setAddress(addr);
                    library.addMember(member);
                    break;
                }
                case 2:{
                   for (Member l : library.viewAllMembers()){
                       System.out.println("Id "+l.getMemberId());
                       System.out.println("Name "+l.getMemberName());
                       System.out.println("Address "+l.getAddress());
                   }
                   break;
                }
                case 3:{
                    System.out.println("Enter the address:");
                    String add= sc.next();
                    List<Member> list= library.viewMembersByAddress(add);
                    if(list.isEmpty()){

                    }else {
                        for (Member l : library.viewAllMembers()) {
                            System.out.println("Id " + l.getMemberId());
                            System.out.println("Name " + l.getMemberName());
                            System.out.println("Address " + l.getAddress());
                        }
                    }
                    break;
                }
                case 4:{
                    System.exit(0);
                }
            }

        }
    }
}
