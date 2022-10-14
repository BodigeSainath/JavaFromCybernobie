package wipro_pjp.oops_inheritance.inheritance.solution2;

public class Employee extends Person{
private double sal;
private int year;
private String insurance;
public Employee(String name, double sal, int year, String insurance) {
	super(name);
	this.sal = sal;
	this.year = year;
	this.insurance = insurance;
}
Person p =new Person();
@Override
public String toString() {
	return "Employee [name "+ name +" sal=" + sal + ", year=" + year + ", insurance=" + insurance + "]";
}


}
