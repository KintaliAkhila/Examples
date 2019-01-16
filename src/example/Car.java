package example;

public class Car {
	
	public void move()
	{
		System.out.println("overriden move method");
	}
	public int capacity()
	{
		System.out.println("overriden capacity method" );
		return 60;
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
