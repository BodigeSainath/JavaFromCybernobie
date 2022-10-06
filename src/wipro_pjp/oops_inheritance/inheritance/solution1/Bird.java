package wipro_pjp.oops_inheritance.inheritance.solution1;

public class Bird extends Animal {
	public void eat() {
		System.out.println("bird eat");
	}
	
	public void sleep() {
		super.sleep();
	}
	public void fly() {
		System.out.println("bird fly");
	}
	
}
