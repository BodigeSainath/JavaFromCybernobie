package wipro_pjp.oops_inheritance.classesAndobj;

public class Ex3 {
	private String patientName;
	private double height,width;
	public Ex3(String patientName, double height, double width) {
		super();
		this.patientName = patientName;
		this.height = height;
		this.width = width;
	}
	public double computeBMI() {
		return width/height*height;
	}
	public static void main(String[] args) {
		Ex3 e=new Ex3("sa", 4, 5.5);
		
		System.out.println(e.patientName+" "+e.computeBMI());
	}

}
