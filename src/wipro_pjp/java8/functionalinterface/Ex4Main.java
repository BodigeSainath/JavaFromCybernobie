package wipro_pjp.java8.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import wipro_pjp.oops_inheritance.inheritance.solution2.Employee;

public class Ex4Main {
	public static void main(String[] args) {
		Ex4Employee employee=new Ex4Employee();
		ArrayList<Ex4Employee> arrayList=new ArrayList<>();
	  arrayList.add( new Ex4Employee(1,"sai",100000.0));
	  arrayList.add(new Ex4Employee(2, "nath", 200000.0));
	  arrayList.add( new Ex4Employee(3,"bsai",1000.0));
	  arrayList.add(new Ex4Employee(4, "bnath", 200000.0));			
	Predicate<? super Ex4Employee> predicate= e -> e.getSalary()<10000;
	List<Ex4Employee> ee=  arrayList.stream().filter( predicate ).collect(Collectors.<Ex4Employee>toList());
	for(Ex4Employee d : ee) {
		System.out.println("s "+d.getName());
	}
	ee.forEach(d -> System.out.println(d.getId()));
	}
}
