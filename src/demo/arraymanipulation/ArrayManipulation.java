package demo.arraymanipulation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {

        System.out.println(new ArrayManipulation().getPriceDetails());
    }
    public String getPriceDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the price details");
        int[] ar = new int[n];
        try {

            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
        }
            catch(InputMismatchException ignore){
                return "Input was not in the correct format";
            }

        System.out.println("Enter the index of the array element you want to access");

        try {
        int index = sc.nextInt();
        return "The array element is " + ar[index];
    } catch (InputMismatchException ignore) {
        return "Input was not in the correct format";
    } catch (ArrayIndexOutOfBoundsException ignore) {
        return "Array index is out of range";
    }
}

    }

