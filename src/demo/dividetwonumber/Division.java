package demo.dividetwonumber;

public class Division {
    public static void main(String[] args) {
        int number1=10,number2=8;
        System.out.println(new Division().divideTwoNumbers(number1, number2));
    }
    public String divideTwoNumbers(int number1,int number2){
        int r=0;
        String str="";
        String msg="Thanks for using the application";
        try {

                r=number1/number2;
               str= "the answer is "+r;

        }
        catch (ArithmeticException e){
          str= "Division by zero is not possible";
        }
        finally {
            str=str+" "+msg;
        }
    return  str;
    }
}
