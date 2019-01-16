package example;

public class ExcExample {
	
	public static void main(String[] args) {
		
		try
		{
		int a=5,b=0;
		int arr[]=new int[2];
		int c=a/b;
		System.out.println(c);
		arr[3]=574;
		String str=null;
		System.out.println(str.length());
		}
		
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException are)
		{
			//System.out.println(ae);
			System.out.println(are);
		}
		
		
		/*catch(ArrayIndexOutOfBoundsException are)
		{
			System.out.println(are);
		}
		
		
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}*/

		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		

}
}
