package wipro_pjp.collections.set;

import java.util.HashSet;

public class Ex1 {
	HashSet<String> countries=new HashSet<>();
public static void main(String[] args) {
	Ex1 e=new Ex1();
	e.saveCountry("us");
	e.saveCountry("ca");
	System.out.println(e);
	
	System.out.println(e.getCountry("us"));
}
public HashSet<String> saveCountry(String countryName) {
	//HashSet<String> countries=new HashSet<>();
	countries.add(countryName);
	return countries;
}
public String getCountry(String getCoun) {
	if(countries.contains(getCoun)) {
		return "present "+getCoun;
	}
	return "not present";
}
}
