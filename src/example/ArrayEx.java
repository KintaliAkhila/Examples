package example;

public class ArrayEx {
	
	public int empId;
	 public String empName;
	 public int Salary;
	public ArrayEx(int empId,String empName,int Salary) 
	{
		this.empId=empId;
		this.empName=empName;
		this.Salary=Salary;
	}
	@Override
	public String toString() {
		return "ArrayEx [empId=" + empId + ", empName=" + empName + ", Salary=" + Salary + "]";
	}
	
}
