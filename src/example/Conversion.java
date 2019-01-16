package example;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) 
	{
		int upperCharCount=0,lowerCharCount=0;
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		if(!input.isEmpty())
		{
			for(char ch:input.toCharArray())
			{
				if(!Character.isDigit(ch) && Character.isAlphabetic(ch))
				{
					if(Character.isUpperCase(ch))
					{
						upperCharCount++;
						System.out.println(upperCharCount);
					}
					else
					{
						lowerCharCount++;
						System.out.println(ch);
						
					}
				}
			}
		}
	}
}
