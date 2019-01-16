package example;

public class Student implements Comparable<Student> {

	int rollNo,age;
	String name;
	public Student(int rollNo,int age,String name)
	{
		this.rollNo=rollNo;
		this.age=age;
		this.name=name;
	}
	@Override
	public int compareTo(Student o) {
		if(age==o.age)
		return 0;
		else 
			return -1;
	
}
}