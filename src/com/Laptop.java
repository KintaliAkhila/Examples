package com;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;*/
import java.util.Scanner;

public class Laptop {

	public String laptopModelName;
	public int laptopModelNo;
	public int laptopPrice;
	public static void main(String[] args)  {
		
	Scanner sc=new Scanner(System.in);
	
     System.out.println("Enter Model Name");
     String laptopModelName=sc.nextLine();
     
     System.out.println("enter Model Number");
     int laptopModelNo=sc.nextInt();
     
     System.out.println("Enter Price");
     int laptopPrice=sc.nextInt();
     
   /*  try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg701","training701");
			PreparedStatement pst=con.prepareStatement("insert into laptop values(?,?,?)");
			pst.setString(1,laptopModelName);
			pst.setInt(2,laptopModelNo);
			pst.setInt(3,laptopPrice);
			pst.executeUpdate();
			ResultSet rs=pst.executeQuery("select * from laptop");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				System.out.println(rs.getInt(2));
				System.out.println(rs.getInt(3));
			}
		}
			
		catch (Exception e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}*/

	  

	
	  

	}



}