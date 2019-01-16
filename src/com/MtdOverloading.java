package com;
public class MtdOverloading{
	
	public static void main(String[] args)
	{
		
		System.out.println("main method with argument args array");
		MtdOverloading.main(574);
		
	}
	public static void main(String str)
	{
		
		System.out.println("main method with string argument");
		
	}
	public static void main(int a)
	{
		
		System.out.println("main method with integer argument");
		MtdOverloading.main("akhila");
	}
	public void overLoad(Object o) {
		System.out.println("Object o argument method.");
	}

	public void overLoad(double[] dArray) {
		System.out.println("double array argument method.");
	}
	/*public void overLoad(String str) {
		System.out.println("akhila");
	}*/
	
}