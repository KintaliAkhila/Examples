package example;

public class SportsCar extends Car {
	
	public void move()
	{
		System.out.println("overriding move method");
	}
	public int capacity()
   {
		System.out.println("overriding capacity method");
		return 40;
   }
	public String fuel()
	{
		return "petrol";
	}
	
	public String task()
	{
		return new String();
	}

	
}
