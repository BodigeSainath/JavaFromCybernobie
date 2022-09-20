package demo.CgJavaBook.collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class ex3 {
    public static void main(String[] args) {
        int[] a={3,11,6,4};
        HashMap<Integer,Integer> hm=getSqaures(a);
        for(Map.Entry<Integer,Integer> h : hm.entrySet()){
            System.out.println("num is "+h.getKey()+" sqaure is "+h.getValue());
        }
    }
    public  static HashMap<Integer,Integer> getSqaures(int[] arr){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i : arr){
            hashMap.put(i,i*i);
        }
    return hashMap;
    }
}
