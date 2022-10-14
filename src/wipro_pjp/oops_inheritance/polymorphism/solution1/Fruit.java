package wipro_pjp.oops_inheritance.polymorphism.solution1;

public class Fruit {
private String name,taste,size;
public Fruit() {
	
}

public Fruit(String name, String taste, String size) {
	super();
	this.name = name;
	this.taste = taste;
	this.size = size;
}

public String getName() {
	return name;
}

public String getTaste() {
	return taste;
}

public String getSize() {
	return size;
}
public void eat() {
	System.out.println("Name is "+name+" taste like "+taste);
}
}
