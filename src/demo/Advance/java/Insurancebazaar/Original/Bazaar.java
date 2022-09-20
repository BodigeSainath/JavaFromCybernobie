package demo.Advance.java.Insurancebazaar.Original;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bazaar {
    public static void main(String[] args) {

        InsuranceBazaar insuranceBazaar=new InsuranceBazaar();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of Policy names you want to store");
        int num= sc.nextInt();
        for(int i=0;i<num;i++) {
            System.out.println("Enter the Policy ID");
            int pId = sc.nextInt();
            System.out.println("Enter the Policy Name");
            String pName = sc.next();sc.nextLine();
            insuranceBazaar.addPolicyDetails(pId,pName);
        }
        HashMap<Integer,String> hashMap=insuranceBazaar.getPolicyMap();
        for (Map.Entry<Integer,String> map : hashMap.entrySet()){
            System.out.println(map.getKey()+"  "+map.getValue());
        }
        System.out.println("Enter tpe to be searched");
        String search=sc.next();
        List<Integer> policies=insuranceBazaar.searchBasedOnPolicyType(search);
        for(int i: policies)
            System.out.println(i);
    }
}
