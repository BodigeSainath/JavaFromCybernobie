package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex2 {
public static void main(String[] args) {
	HashMap<String, String> m=new HashMap<String, String>();
	m.put("one", "twp");
	m.put("three", "four");
	String r=m.getOrDefault("oe", "default");//value
	System.out.println(r);
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String ss=find(s,m);
	System.out.println(ss+"\n");
	Iterator<String> it=m.keySet().iterator();
	while(it.hasNext()) {
		String k=it.next();
		System.out.println("key "+k +" val "+m.get(k));
	}

}
public static String find(String s,HashMap<String, String> map) {
	for(String key : map.keySet()) {
		if(key.equalsIgnoreCase(s)) {
			return "true";
		}
	}
	return "false";
}

}
