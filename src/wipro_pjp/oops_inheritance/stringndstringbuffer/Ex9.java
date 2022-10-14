package wipro_pjp.oops_inheritance.stringndstringbuffer;

public class Ex9 {
public static void main(String[] args) {
String a="sai",b="nath",r="";
int m=(a.length()<b.length()) ?a.length() :b.length();
for(int i=0;i<m;i++) {
	r=r+a.charAt(i)+b.charAt(i);
}
System.out.println(r);
}
}
