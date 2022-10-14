package wipro_pjp.oops_inheritance.stringndstringbuffer;

public class Ex2 {
public static void main(String[] args) {
	String a=new String("mar");
	String b="sai";String r="";
	char aa=a.charAt(a.length()-1);
	char bb=b.charAt(0);
	if(aa==bb) {
	r=a.concat(b.substring(1));
	}else {
		r=a.concat(b);
	}
	System.out.println(r);
}
}
