package demo.NumerologyArray;
import java.util.*;
public class Numerology {
    public static void main(String[] args) {
        HashMap<Character,Integer> num=new HashMap<>();
        num.put('A',2);
        num.put('B',3);
        num.put('C',5);
        String s="CA";
        char[] c=s.toCharArray();
//        for(Map.Entry m :num.entrySet()){
//
//            if(m.getKey().equals()){
//             int a=0;
//             int r=a+num.get(s);
//System.out.println(r);
//            }
int r=0;
        for(char ch : c) {
            r = r + num.get(ch);
        }
        System.out.println(r);

    }
}

