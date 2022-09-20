package demo.CgJavaBook.collections.Maps;

import java.util.Collections;

public class ex7 {
    public static void main(String[] args) {
        int[] ar={32,14,533,653,79};
//        int[] result=getSorted(ar);
//    }
//    public static int[] getSorted(int[] a){
        StringBuffer stringBuffer=new StringBuffer();
        for( int i : ar){
            String s=String.valueOf(i);
            stringBuffer.reverse().append(s);
        }

    }
}
