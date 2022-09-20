package demo.CgJavaBook.String;

public class ex8 {
    public static void main(String[] args) {
        String s="ant";
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]<chars[i+1]){
                System.out.printf("true");
            }else
                System.out.printf("fal");
        }
    }
}
