package example;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>() ;
		al.add(new Student(166186,21,"akhila"));
		al.add(new Student(166189,20,"anmisha"));
		System.out.println("Before sorting");
		for(Student index:al)
		{
			System.out.println(index.age);
		}
		System.out.println("After sorting");
		Collections.sort(al);
		for(Student index:al)
		{
			System.out.println(index.age);
		}
		
	}
}
