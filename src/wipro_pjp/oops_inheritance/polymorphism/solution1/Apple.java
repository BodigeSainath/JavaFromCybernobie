package wipro_pjp.oops_inheritance.polymorphism.solution1;

public class Apple extends Fruit {
	private String name,taste,size;
	
	public Apple(String name, String taste, String size) {
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


	@Override
	public void eat() {
	System.out.println(" Name is "+name +" taste like "+taste+" size is "+size);	
	}
}
