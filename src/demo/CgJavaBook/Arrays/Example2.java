package demo.CgJavaBook.Arrays;

import java.util.Locale;

public class Example2 {
    public static void main(String[] args) {
       String[] s={"sai","bodige","nand","bsn"};
      input(s);
      for(int i=0;i< s.length;i++){
          System.out.println(s[i]);
      }
    }
    public static String[] input(String[] str){
      int mid;
        if(str.length%2!=0){
          mid= str.length/2+1;
      }else {
            mid= str.length/2;
        }
        for(int i=0;i<mid;i++){
            str[i]=str[i].toUpperCase();
        }
        for(int i=mid+1;i< str.length;i++){
            str[i]=str[i].toLowerCase();
        }
        return str;
    }
}
