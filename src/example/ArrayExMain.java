package example;

public class ArrayExMain {
	public static void main(String[] args) {
		
		ArrayEx[] arrayex= new ArrayEx[3];
		arrayex[0]=new ArrayEx(166186,"akhila",15000);
		arrayex[1]=new ArrayEx(166187,"adarsh",15000);
		arrayex[2]=new ArrayEx(166188,"anu",15000);
		
		for(int i=0;i<arrayex.length;i++)
		{
			System.out.print(arrayex[i]+"\n");
		
			
		}
	}

}
