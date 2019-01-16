package example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {
      public void mtd(String name)
        {
			Pattern pattern=Pattern.compile("[A-Z][a-z]{2,6}");
			Matcher matcher=pattern.matcher(name);
			System.out.println(matcher.matches());
		}
}
