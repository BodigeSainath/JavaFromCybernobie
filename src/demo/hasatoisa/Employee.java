package demo.hasatoisa;

public class Employee extends Address {
int id;
String name;


public Employee(String city,String state,String country,int id, String name) {
super(city,state,country);	
	//super();
this.id = id;
	this.name = name;
	
}

void display(){

System.out.println(city+" "+state+" "+country+" "+id+name);
}

public static void main(String[] args) {
//Address a=new Address("hyd","tg","IND");
Employee e=new Employee("hyd","tg","in",1,"sai");

	
e.display();
e.display();
	
}
}
