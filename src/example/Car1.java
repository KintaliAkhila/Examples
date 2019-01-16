package example;

public class Car1 implements Vehicle1,Vehicle2 {

	@Override
	public void speed() {
		System.out.println("30");
		
	}

	@Override
	public void fuel() {
		System.out.println("Diesel");
		
	}

	@Override
	public void brake() {
		System.out.println("It doesn't work properly..");
		
	}

	@Override
	public void accelerate() {
		System.out.println("100");
		
	}

	@Override
	public void model() {
		System.out.println("fcvfza");
		
	}
	public void mode()
	{
		System.out.println("mode");
	}

}
