package demo.CgJavaBook.Lambda;

interface factorial {
    int factorial(int number);
}
public class ex5 {
    public static void main(String[] args) {
        factorial f=number -> {
            int fact=1;
            for(int i=1;i<=number;i++){
                fact=fact*i;
            }
            return fact;
        };
       int r= f.factorial(6);
        System.out.println("Factorial is "+r);
    }
}
