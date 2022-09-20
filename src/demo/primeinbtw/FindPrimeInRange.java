package demo.primeinbtw;

public class FindPrimeInRange {
public static void main(String[] args) {
	int a=2,b=15;
	findPrime(a,b);
}

private static void findPrime(int a, int b) {
	for(int i=a;i<=b;i++) {
		boolean flag=true;
		if (i == 1 || i == 0)
            continue;

		for(int j=i-1;j<=b/2;++j) {
			if(i%j==0) {
	flag=false;
				break;
			}
	}
		if(flag==true)
			System.out.println(i);
	
}
}
}
