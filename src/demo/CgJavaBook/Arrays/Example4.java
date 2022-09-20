package demo.CgJavaBook.Arrays;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        Integer[] a={12,1,10,1,13,21,1,1,1};

      List<Integer> list=Arrays.asList(a);
       Set<Integer> set=new HashSet<>();
       set.addAll(list);
       for(int s : set){
           System.out.println(s);
       }


    }
}
