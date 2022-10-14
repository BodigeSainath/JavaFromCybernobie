package wipro_pjp.arrays;

import java.util.Scanner;

public class Ex9ReverseArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter size");
        int a=scanner.nextInt(),b= scanner.nextInt();
        int[][] ar=new int[a][b];
        System.out.println(ar.length);
        if(ar.length<4){
            System.out.println("Enter 4 atleast");
            System.exit(0);
        }
        System.out.println("elements");
        for (int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                ar[i][j]= scanner.nextInt();
            }
        }
        if(ar.length<4){
            System.out.println("Enter 4 atleast");
            System.exit(0);
        }
       // int [][] ar={ {1,2}, {3,4} };
        for(int i= ar.length-1;i>=0;i--){
            for(int j=ar.length-1;j>=0;j--){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
