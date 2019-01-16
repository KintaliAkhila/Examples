package example;

public class BoxDemo {
	

	public static void main(String[] args) {
		
		Box box=new Box();
		String strobj=new String();
		Object obj=new Object();
		obj=strobj;
		double result = box.calcvol();
		System.out.println(result);
		
		
	
		}

}
