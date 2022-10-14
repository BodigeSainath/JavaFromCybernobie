package wipro_pjp.java8.dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex2 {
public static void main(String[] args) {
	LocalDate date=LocalDate.now().plusMonths(1);
	System.out.println(date);
}
}
