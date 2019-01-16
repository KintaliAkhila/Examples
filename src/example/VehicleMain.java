package example;

public class VehicleMain {
	
	public static void main(String[] args) {
		
		Bike b=new Bike();
		Bus bus=new Bus();
		b.transport();
		bus.transport();
		b.fuel();
		b.speed();
		bus.speed();
		bus.fuel();
		b.capacity();
		Vehicle vehicle=new Bike();
		//vehicle.capacity();
		vehicle.speed();
		
	}

}
