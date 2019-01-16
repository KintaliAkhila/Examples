package example;

public interface Vehicle2 extends Vehicle3,Vehicle4 {

	void brake();
	default void mode()
	{
		System.out.println("mode2"); 
	}
}
