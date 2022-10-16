package wipro_pjp.java8.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex6 {
	public static void main(String[] args) {
		
	ArrayList<String> al=new ArrayList<>(Arrays.asList("sai","nath","bodige"));
	ArrayList<String> res=new ArrayList<>();
	Consumer<String> consumer= c-> res.add(revString(c));
	al.forEach(c-> consumer.accept(c));
	res.forEach(System.out :: println);
	
 }

	private static String revString(String s) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer();
			str.append(s);	
			return 	str.reverse().toString();    
	}
}
