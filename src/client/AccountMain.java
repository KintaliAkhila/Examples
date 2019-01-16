package client;

import accountTypes.CurrAccount;
import accountTypes.SavAcc;

public class AccountMain {
	
	 public static void main(String[] args) {
		
		 SavAcc s1=new SavAcc();
		 CurrAccount c1=new CurrAccount();
		 
		 s1.Deposit();
		 s1.addsavAccount();
		 s1.display();
		 c1.Withdraw();
		 c1.deleteCurrAccount();
		 
		 System.out.println(s1.a);
		 System.out.println(c1.a);
	}

}
