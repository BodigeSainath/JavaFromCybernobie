package demo.hosteldetails;

import java.util.Scanner;

public class Main {

    public static Hostel getHostellerDetails(){
        Scanner sc=new Scanner(System.in);
        Hostel s=new Hostel();
        System.out.println("Enter details...");
        System.out.println("Enter Id");
        int sid=s.setSid(sc.nextInt());
        System.out.println("Enter name");
        String sname=s.setName(sc.next());
        System.out.println("Enter dept id");
        int depId=s.getDid(sc.nextInt());
        System.out.println("Enter gender");
        String gen=s.setGender(sc.next());
        System.out.println("Enter phone");
        String phn=s.setPhone(sc.next());
        System.out.println("enter Hostel name");
        String hname=s.setHostelName(sc.next());
        System.out.println("Enter room number");
        int rno=s.setRoomNumber(sc.nextInt());
        System.out.println("modify room number(y/n)");
        String option=sc.next();
        if(option.equalsIgnoreCase("Y")) {
            hname = s.setHostelName(sc.next());
        }
        Hostel hostel=new Hostel(sid,sname,depId,gen,phn,hname,rno);
        return hostel;
    }

    public static void main(String[] args) {
        getHostellerDetails();
        Hostel hh=new Hostel();
        System.out.println("the student details");
        System.out.println(hh.getSid()+" "+hh.getName()+" ");
    }
}
