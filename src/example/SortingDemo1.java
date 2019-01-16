package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingDemo1 {

	public static void main(String[] args) {
		
		
		ArrayList<MyStudent> al=new ArrayList<MyStudent>() ;
		al.add(new MyStudent(166186,21,"khila"));
		al.add(new MyStudent(166189,20,"anmisha"));
		
		
		NameComparator ns=new NameComparator();
		
		Collections.sort(al,ns);
		
		Iterator<MyStudent> iterator=al.iterator();
		
		while(iterator.hasNext()) {
			MyStudent stu=iterator.next();
			System.out.println(stu.name);
		}
	
		
	}
}
