package wipro_pjp.oops_inheritance.inheritance.solution2;

public class Person {
protected String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Person(String name) {
	super();
	this.name = name;
}

public Person() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Person [name=" + name + "]";
}

}
