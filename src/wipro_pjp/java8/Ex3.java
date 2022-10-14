package wipro_pjp.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Ex3 {
public static void main(String[] args) {
	LocalDate date1=null;
	Scanner input=new Scanner(System.in);
	  SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
      System.out.println("Enter check-in date (gg/aa/yy):");
      String cinput = input.nextLine();
      if(null != cinput && cinput.trim().length() > 0){
           try {
			date1 = format.p
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
	//LocalDate joiningDate = LocalDate.of(2015,5,5);
	Period d = Period.between(date1,LocalDate.now());
	int days = d.getDays(); 
	int months = d.getMonths(); 
	int years = d.getYears();
	System.out.println("Experience : " + years + " years " + months + " months " + days + " days." );
}
}
