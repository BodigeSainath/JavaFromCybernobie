package demo.CgJavaBook.String;

public class Ex3 {
    public static void main(String[] args) {
        String s="JAVA";
        char[] ss=s.toCharArray();
        for(int i=0;i<ss.length;i++){
           if(ss.equals('A')){
                ss[i]= (char) (ss[i]+1);
            }
        }
       // for(int i=0;i<ss.length;i++)
        System.out.println(ss+" ");
    }
}
