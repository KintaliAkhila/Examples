package com;

public class Car {
	
	public void move()
	{
		System.out.println("move method");
	}
	public void move(int a)
	{
		System.out.println("move method with one argument");
	}
	public int capacity()
	{
		System.out.println("capacity method" );
		return 60;
	}
	public int capacity(int a,int b)
	{
		System.out.println("capacity method" );
		return 80;
	}
	public String fuel()
	{
		return "diesel";
	}
	
	public String task()
	{
		return new String();
	}

}