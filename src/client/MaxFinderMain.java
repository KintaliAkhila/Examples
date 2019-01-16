package client;

public class MaxFinderMain {
	
	
	public static void main(String[] args) {
		
		MaxFinder finder=(num1,num2)->num1>num2?num1:num2;
		int result=finder.maximum(15, 20);
		System.out.println(result);
		
	}

}
