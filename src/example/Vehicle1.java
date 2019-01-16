package example;

public interface Vehicle1 {
	int a=3;
	void speed();
	void fuel();
	void brake();
	default void mode()
	{
		System.out.println("mode");
	}
	 static void mode1()
	{
		System.out.println("mode");
	}
	}
