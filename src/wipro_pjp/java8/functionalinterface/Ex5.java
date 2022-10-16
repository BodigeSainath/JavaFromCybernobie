package wipro_pjp.java8.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Ex5 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4,5,7,11,9,25));
	Predicate<Integer> p;// i -> Math.floor(Math.sqrt(i));
//	Predicate<Integer> p = i -> ((Math.sqrt(i) - Math.floor(Math.sqrt(i))) == 0) ? true : false;
//	ArrayList<Integer> res = new ArrayList<>();
//	list.forEach(
//	i -> {
//		if(p.test(i))res.add(i);
//		}
//	);
//	System.out.println(res);
}
}
