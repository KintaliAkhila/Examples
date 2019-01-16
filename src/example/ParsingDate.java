package example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ParsingDate {
	public static void main(String[] args) {
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date in dd/MM/yyyy format:");
		String input=sc.nextLine();
		LocalDate enteredDate=LocalDate.parse(input, formatter);
		System.out.println("Entered Date:"+enteredDate);
		sc.close();
		
	}

}
