package demo.CgJavaBook.collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class ex2 {
    public static void main(String[] args) {
        char[] c={'a','b','a','c','b'};
        Map<Character,Integer> m=countChars(c);
        for (Map.Entry<Character,Integer> entry : m.entrySet()){
            System.out.println("Char is "+entry.getKey()+"  "+" occured "+entry.getValue());
        }
    }
    public static HashMap<Character,Integer> countChars(char[] chars){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c : chars){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        return map;
    }
}
