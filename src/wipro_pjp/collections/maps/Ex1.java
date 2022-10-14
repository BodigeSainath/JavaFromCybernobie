package wipro_pjp.collections.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Ex1 {
	static HashMap<String, String> m1=new HashMap<>();
public static void main(String[] args) {
	Ex1 e=new Ex1();
	e.saveCountry("India","delghi");
	e.saveCountry("tokyo", "japan");
	e.display();
	System.out.println(e.getCapital("jan"));
	ArrayList<String> lis=e.listFromMap(m1);
	System.out.println(lis);
	e.exchange(m1);
}
 
public HashMap<String , String> saveCountry( String string, String string2){
	m1.put(string, string2);
	return m1;
 }
public String getCapital(String cap){
	for (Entry<String, String> entry : m1.entrySet()) {
		if(entry.getValue().equalsIgnoreCase(cap)) {
			return "found"; 
		}
		
	}
	return "not found";
}
public void exchange(HashMap<String, String> m) {
	HashMap<String, String> m2=new HashMap<>();
	for(Entry<String, String> entry : m.entrySet()) {
		m2.put(m.get(entry.getKey()), m.get(entry.getValue()));
	}
	for (Entry<String, String> entry : m2.entrySet()) {
		String key = entry.getKey();
		String val = entry.getValue();
		System.out.println(key +" -- "+val);
	}
}
public void display() {
	for (Entry<String, String> entry : m1.entrySet()) {
		String key = entry.getKey();
		String val = entry.getValue();
		System.out.println(key +" - "+val);
		
	}
}
public ArrayList<String> listFromMap(HashMap<String, String> map){
	ArrayList<String> al=new ArrayList<>();
	for (Entry<String, String> entry : map.entrySet()) {
		al.add(entry.getKey());
		al.add(entry.getValue());
	}
	return al;
}
}
