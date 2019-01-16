package example;

import java.util.Scanner;

public class AgeExceptionMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur age:");
		int age=sc.nextInt();
		try
		{
			if(age<18)
				throw new AgeException("Invalid age");
			else
				System.out.println("valid age");
		}
		catch(AgeException ae) {
			System.out.println(ae);
		}

	}

}
