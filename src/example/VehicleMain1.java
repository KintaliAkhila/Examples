package example;

public class VehicleMain1 {
	
	public static void main(String[] args) {
		
		Vehicle1 vehicle1=new Car1();
		vehicle1.fuel();
		vehicle1.speed();
		vehicle1.mode();
		Vehicle2 vehicle2=new Car1();
		vehicle2.brake();
		vehicle1.brake();
		System.out.println(Vehicle1.a);
	}

}
