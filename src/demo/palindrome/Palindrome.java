package demo.palindrome;

public class Palindrome {
public static void main(String[] args) {
	int n=21265;
	findPalin(n);
}
public static void findPalin(int n) {
	int p=0;int d=n;
	while(n>0) {
		d=n%10;
		p=p*10+d;
		n/=10;
	}
if(n==p)
	System.out.println("Palindrome");
else
	System.out.println("no");
}
}
