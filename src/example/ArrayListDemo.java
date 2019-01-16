package example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList arrayList=new ArrayList();
		ArrayList a2=new ArrayList();
		arrayList.add("pen");
		arrayList.add("pencil");
		arrayList.add("marker");
		arrayList.add("eraser");
		arrayList.add("marker");
		System.out.println(arrayList);
		arrayList.remove("pen");
		System.out.println(arrayList);
		a2.add("book");
		a2.add("scale");
		arrayList.addAll(a2);
		System.out.println(arrayList);
		System.out.println(arrayList.isEmpty());
		
		
		LinkedList linkedList=new LinkedList();
		linkedList.add("dove");
		linkedList.add("mysore sandal");
		linkedList.add("santoor");
		linkedList.add("dove");
		linkedList.add("pears");
		System.out.println(linkedList);
		
		
		SortedSet ss=new TreeSet();
		ss.add("fried rice");
		ss.add("chicken biryani");
		ss.add("ice cream");
		ss.add("chicken popcorn");
		System.out.println(ss);
		
		
		
		
		
	
	}

}
