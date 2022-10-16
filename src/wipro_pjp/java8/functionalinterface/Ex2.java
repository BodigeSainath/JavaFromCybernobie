package wipro_pjp.java8.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {
public static void main(String[] args) {
	ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//	FI(takes 2 argumts (T t) t is i/p type t is o/p hv 4 types method
//	apply
//	andThen
//	compose
//	identity
	
	Function<ArrayList<Integer>, Double> sum= s->{
		Double res=0.0;
		if(s.contains(9)) {
			System.out.println("yty");
		}
		for(Integer i : s) {
			res=res+i;
		}
		
		return res;
		
	};
	arrayList.stream().filter(i -> (i>5)).forEach(System.out :: println);;
	List<Integer> in=arrayList.stream().filter(i -> (i>5)).collect(Collectors.toList());
	//int inn=arrayList.stream().filter(i -> (i>5)).collect(Collectors.averagingInt(arrayList));
	System.out.println(sum.apply(arrayList));
	System.out.print(in);
}
}
