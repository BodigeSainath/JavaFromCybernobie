package demo.Advance.java.InnerClass;

import java.util.Scanner;

public class TestMain {
    public  static  AddressBook.Address getAddress(String addressType) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the "+addressType);
        System.out.println("Enter the house name");
        String tname = sc.next();
        System.out.println("Enter the street\n");
        String tstreet = sc.next();
        System.out.println("Enter the city");
        String tcity = sc.next();
        System.out.println("Enter the state");
        String tstate = sc.next();
        AddressBook.Address addressBook = new AddressBook.Address();
        addressBook.setName(tname);
        addressBook.setStreet(tstreet);
        addressBook.setCity(tcity);
        addressBook.setState(tstate);
        return  addressBook;
    }
    public static void display(String addressType, AddressBook.Address add){
        System.out.println(addressType);
        System.out.println("House name "+add.getName());
        System.out.println("House street "+add.getStreet());
        System.out.println("house city "+add.getCity());
        System.out.println("House state "+add.getState());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AddressBook.Address padd=getAddress("permanent address");
        AddressBook.Address tadd=getAddress("temparary address");
        AddressBook addressBook=new AddressBook();
        addressBook.setPermAddress(padd);
        addressBook.setTempAddress(tadd);
        System.out.println("Enter the phone number");
        long phoneNumber = Long.parseLong(sc.nextLine());
        addressBook.setPhoneNumber(phoneNumber);
        display("Permanent address",addressBook.getPermAddress());
        display("Temparary address",addressBook.
                getTempAddress());
        System.out.println("Enter phone");
        System.out.println(addressBook.getPhoneNumber());
    }
}
