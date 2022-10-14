package wipro_pjp.oops_inheritance.classesAndobj;

public class Ex1 {
	private double h;
	private static double w;
	private double l;

	public Ex1() {
	
}
	public Ex1(double h, double w, double l) {
		super();
		this.h = h;
		this.w = w;
		this.l = l;
	}
	public  double vol() {
		return h*w*l;
	}
	public static void main(String[] args) {
		Ex1 e=new Ex1(2,3,4);
		
		System.out.println(e.vol());
	}
}
