package accountTypes;

import account.Account;

public class SavAcc extends Account{
  
	public int a=34;
	public SavAcc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void addsavAccount()
	{
		System.out.println("SAVINGS ACCOUNT ADDED");
		super.Withdraw();
	}
	public void deleteSavAccount()
	{
		System.out.println("SAVINGS ACCOUNT DELETED");
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
	

}
