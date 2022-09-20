package demo.Advance.java.Insurancebazaar;

import demo.employeeloan.Main;

import java.util.*;

public class Insurance {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Policy names you want to store");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the Policy ID");
            int policyId = sc.nextInt();
            System.out.println("Enter the Policy Name");
            String policyName = sc.next();sc.nextLine();
            hashMap.put(policyId, policyName);
        }

        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hashMap);
        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            int key = (int) iterator.next();
            System.out.println(key + " " + hashMap.get(key));
        }
        System.out.println("Enter the policy type to be searched");
        String search=sc.next();
        for (Map.Entry<Integer, String> entry :tm.entrySet()){
            if(entry.getValue().contains(search)){
                System.out.println(entry.getKey());
            }
        }
    }

}
