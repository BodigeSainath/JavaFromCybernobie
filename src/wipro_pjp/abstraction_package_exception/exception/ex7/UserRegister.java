package wipro_pjp.abstraction_package_exception.exception.ex7;

import wipro_pjp.oops_inheritance.encapAndabstract.main;

class InvalidCountries extends Exception {
	public InvalidCountries() {
		System.out.println("User out of India");
	}
}
public class UserRegister  {
	
	void registerUser(String n,String c) throws InvalidCountries {
		
		if(!c.equalsIgnoreCase("india")) {
			throw new InvalidCountries();
		}
		else {
			System.out.println("USer added");
		}
		
	}
	public static void main(String[] args) throws InvalidCountries {
		String n="saif";
		String c="india";
		UserRegister u=new UserRegister();
		try {
		u.registerUser(n, c);
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
}
}