package example;

public class CarMain {

	public static void main(String[] args) {
		
		SportsCar sc=new SportsCar();
		sc.move();
		sc.capacity();
		 String str=sc.fuel();
		 System.out.println(str);
		 System.out.println(sc.task());
	}
}
