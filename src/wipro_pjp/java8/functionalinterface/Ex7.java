package wipro_pjp.java8.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class Ex7 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	Consumer<ArrayList<Integer>> con= c -> c.forEach(
			i -> System.out.println( i + (i%2==0 ? " is even ":" is odd"))); 
	con.accept(al);
}
}

