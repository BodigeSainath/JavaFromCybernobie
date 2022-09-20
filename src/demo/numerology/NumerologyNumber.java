package demo.numerology;

public class NumerologyNumber {
public static void main(String[] args) {
	int n=28,c=0, res=0;
 int x=sum(n);
 String l=Integer.toString(x);
  if(l.length()!=1)
 res = sum(x);

System.out.println(res);
}
private static int sum(int n) {
	int sum=0;
	while(n>0) {
		
		int d=n%10;
	    sum=sum+d;
	    n/=10;
	}
return sum;
}
}
