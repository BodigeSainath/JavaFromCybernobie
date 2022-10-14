package wipro_pjp.abstraction_package_exception.exception;

import java.util.Scanner;

public class Ex1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	
//	if(Character.isDigit(a)) {
//		a=a*a;
//	}
//	else {
//		throw new NumberFormatException("Input is not number");
//		
//	} //minee
	try {
		int a=Integer.parseInt(s);
		System.out.println("resutl "+a*a);
	}catch (NumberFormatException e) {
		// TODO: handle exception
		System.out.println("Input invalids");
	}
	
}
}
