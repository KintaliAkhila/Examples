package example;

//import java.util.Scanner;

//import static java.lang.Math.*;

public class Box {
	
	double width,height,length;
	static int count;
	
	
	
   Box() {
		this(2);
		System.out.println("default constructor");
		count++;
		System.out.println(count);
	}
	Box(int width,int height,int length)
	{
		this.length=length;
		this.height=height;
		this.width=width;
		System.out.println("parameterised constructor with 3 parameters");
		count++;
	}
	Box(int l)
	{
		this(3,4,5);
		length=l;
		System.out.println(l);
		count++;
		System.out.println(count);
	}



	 double calcvol()
	{
	   return width*height*length;
	
		//System.out.println(sqrt(5));
		
	}

}

