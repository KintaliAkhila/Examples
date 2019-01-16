package example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
	
	public void mtd(CharSequence number)
    {
		Pattern pattern=Pattern.compile("[6-9][0-9]{9}");
		Matcher matcher=pattern.matcher(number);
		System.out.println(matcher.matches());
	}
	public void mail(String mailid) {
		
		Pattern pattern=Pattern.compile("[a-z]+[.][a-z]+[@capgemini.com]");
		Matcher matcher=pattern.matcher(mailid);
		System.out.println(matcher.matches());
				
	}
}
