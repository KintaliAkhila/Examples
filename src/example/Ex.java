package example;

import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("What's Your name?");
			String input=sc.nextLine();
			if(input.isEmpty())
			{
				break;
			}
			System.out.println("My name is:"+input);
			
			
		}
		sc.close();
	}
}
