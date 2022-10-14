package wipro_pjp.abstraction_package_exception.exception;

import java.util.Scanner;

public class Ex2 {
public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
	Scanner sc=new Scanner(System.in);
	System.out.println("size");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("elemtns");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("which index u want in btw 1 to "+a.length);
	try {
		
	int i=sc.nextInt();
	if(i<0) 
		throw new NullPointerException("nukk");
	System.out.println(a[i-1]);
    }	catch (Exception e) {
		// TODO: handle exception
    	System.out.println(e.getClass());
	}
}
}
