package example;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		MyStudent s1=(MyStudent) o1;
		MyStudent s2=(MyStudent) o2;
		return s1.name.compareTo(s2.name);
	}

}

	
	


