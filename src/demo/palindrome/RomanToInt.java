package demo.palindrome;

public class RomanToInt {
public static void main(String[] args) {
String s="CC";
int r=romanToInt(s);
System.out.println(r);
}
	    public static int romanToInt(String s) {
	        int result=0,n=0;
	        for(int i=s.length()-1;i>=0;i--){
	            switch(s.charAt(i)){
	                case 'I' : n=1; break;
	                case 'V' : n=5; break;
	                case 'X' : n=10; break;
	                case 'L' : n=50; break;
	                case 'C' : n=100; break;
	                    case 'D' : n=500; break;
	                    case 'M' : n=1000; break;
	            }
	            if(4* n < result)
	                result=result-n;
	            else
	                result=result+n;
	        }
	    return result;
	    }
	}


