package demo.CgJavaBook.String;

public class ex5 {
    public static void main(String[] args) {
        String s="helllo today is a " +
                "good day";
        char[] chars=s.toCharArray();int w=0;int l=0;int line=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==' '){
                w+=1;
            }
            else if(chars[i]>='a' && chars[i] <='z' ){
             l+=1;
            }
            else if(chars[i]=='\n'){
                line+=1;
            }
        }
        System.out.println("words "+(w+1)+" characters "+l+" lines "+line);
    }
}
