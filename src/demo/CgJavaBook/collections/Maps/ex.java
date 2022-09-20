package demo.CgJavaBook.collections.Maps;

import java.util.*;

public class ex {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"sai");
        map.put(3,"ruc");
        map.put(2,"sun");
        map.put(4,"bud");
       getValue((HashMap<Integer, String>) map);
    }
    public static HashMap<Integer,String> getValue(HashMap<Integer, String> m){
        TreeMap<Integer,String> treeMap = new TreeMap<>(m);
        for (Map.Entry<Integer,String> entry : treeMap.entrySet()){
            System.out.println(entry.getValue()+" "+entry.getKey());
        }
    return null;
    }

}
