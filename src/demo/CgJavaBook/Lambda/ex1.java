package demo.CgJavaBook.Lambda;


   interface ex{
   void demo(int a,int b);
   }
public class ex1 {
    public static void main(String[] args) {
    ex e=( a, b)-> System.out.println(Math.pow(a,b));

    e.demo(10,2);

    }

   }

