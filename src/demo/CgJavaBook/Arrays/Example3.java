package demo.CgJavaBook.Arrays;

import java.util.Arrays;

public interface Example3 {
    public static void main(String[] args) {
        int[] a={12,23,532,48};
        int[] c=input(a);
        for(int z: c)
            System.out.println(z);
    }
    public static int[] input(int[] arr){
        int[] b=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            b[i]=rev(arr[i]);
        }
        Arrays.sort(b);
    return b;
    }

    static int rev(int i) {
        int r=0;
        while (i>0){
            int n=i%10;
            r=r*10+n;
            i/=10;
        }
    return r;
    }
}
