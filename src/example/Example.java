package example;

import java.util.Arrays;

public class Example {
	public static void main(String[] args) {
		
		int a[]= {6,3,9,1};
		int c[]= {3,0,2,1};
		for(int index:a) {
			System.out.println(index);
		}
	
		System.out.println("position of element is at "+Arrays.binarySearch(a,9));
		Arrays.sort(c);
		for(int i:c)
		{
			System.out.println(i);
		}
		int[] copy = Arrays.copyOf(c, 5);
		copy[1]=9;
		for(int j=0;j<copy.length())
	}

}
