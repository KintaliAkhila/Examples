package account;

public class Account {
	//final int accid=574;
	protected int a=30;
     public Account()
	{
		System.out.println("super constructor");
	}
	
	public void Withdraw()
	{
		
		System.out.println("Withdrawing");
		//accid++;
		
	}
	public void Deposit()
	{
		System.out.println("Deposit");
	}

}
