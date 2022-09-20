package demo.cipher;

public class CipherTechnique {
public static void main(String[] args) {
	String msg="India";
	//char[] ch=msg.toCharArray();
	char[] res = new char[10];

	for(int i=0;i<msg.length()-1;i++) {
		//char a='j';
		res[i]=(char) (msg.charAt(i)-7);
		 if (res[i] < 97) {
             res[i] = (char) (122 - (97 - res[i]) + 1);
         } else {
        	 res[i] = (char) res[i];
         }
	}
	for(int i=0;i<res.length-1;i++) {
		System.out.print(res[i]);
	}
}
}
