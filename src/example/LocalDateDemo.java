package example;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateDemo
{
	public static void main(String[] args)
	{
		
		LocalDate today=LocalDate.now();
		System.out.println(today);
		System.out.println(today.getMonth());
		System.out.println(today.plusDays(1));
		System.out.println(today.minusDays(2));
		System.out.println(today.withDayOfMonth(30));
		System.out.println(today.lengthOfMonth());
		System.out.println(today.getDayOfYear());
		System.out.println(today.getMonthValue());
		System.out.println(today.getYear());
		
		
		
		ZonedDateTime currentTime=ZonedDateTime.now();
		System.out.println("India:"+currentTime);
		ZonedDateTime currentTimeInParis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(currentTimeInParis);
		
		
		
		
		
		
		
		
		
		
		DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		
		System.out.println(	today.format(formatter));
		/*DateTimeFormatter formatter1=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		today.format(formatter1);
		System.out.println(formatter1);
		DateTimeFormatter formatter2=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		today.format(formatter2);
		System.out.println(formatter2);
		DateTimeFormatter formatter3=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		today.format(formatter3);
		System.out.println(formatter3);*/
		
		
		
		
		
		
		LocalDate Dob=LocalDate.of(1996,Month.SEPTEMBER, 30);
		Period period=Dob.until(today);
		System.out.println(period.getDays());
		System.out.println(period.getMonths());
		System.out.println(period.getYears());
		
		
	}

}
