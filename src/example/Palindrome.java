package example;

public class Palindrome {
	public static void main(String[] args) {
		
		int temp,remainder,sum=0,num=768;
		temp=num;
		while(num>0)
		{
			remainder=num%10;
			sum=(sum*10)+remainder;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("given number is not a palindrome");
		}
	}

}
