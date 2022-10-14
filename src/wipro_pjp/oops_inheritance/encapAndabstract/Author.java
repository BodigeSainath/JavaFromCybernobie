package wipro_pjp.oops_inheritance.encapAndabstract;

public class Author {
//	private String name,mail;
//	private char g;
//	public Author(String name, String mail, char g) {
//		super();
//		this.name = name;
//		this.mail = mail;
//		this.g = g;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getMail() {
//		return mail;
//	}
//	public void setMail(String mail) {
//		this.mail = mail;
//	}
//	public char getG() {
//		return g;
//	}
//	public void setG(char g) {
//		this.g = g;
//	}
	private String name, email;
	private char gender;
	
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
		
	}
	@Override
	public String toString() {
		return "Author [Name: " + name + ", Email: " + email + ", Gender: " + gender + "]";
	}
	

}
