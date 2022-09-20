package demo.password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordGeneration {
    public static void main(String[] args) {
        String s="Ab12345@";
        Pattern p=Pattern.compile("^(?=(?:[^A-Z]*[A-Z]+[^A-Z]*))(?=(?:[^a-z]*[a-z]+[^a-z]*))(?=(?:[^@*#]*[@*#]+[^@*#]*))(?=(?:\\\\D*\\\\d+\\\\D*))[a-zA-Z\\\\d@*#]{8,}");


            Matcher matcher=p.matcher(s);
            if(matcher.matches()){
                System.out.println("Accepted");
            }else
                System.out.println("Incorrect");


    }
}
