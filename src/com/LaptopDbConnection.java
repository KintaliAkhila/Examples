package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class LaptopDbConnection {


		public static void main(String[] args) throws ClassNotFoundException  {
			
			Scanner sc=new Scanner(System.in);
			Laptop lp=new Laptop();
	
			
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg701","training701");
				PreparedStatement pst=con.prepareStatement("insert into laptop values(?,?,?)");
				
				//String laptopModelName=sc.nextLine();
				pst.setString(1,lp.laptopModelName);
				
				//int laptopModelNo=sc.nextInt();
				pst.setInt(2,lp.laptopModelNo);
				
				//int laptopPrice=sc.nextInt();
				pst.setInt(3,lp.laptopPrice);
				pst.execute();
				ResultSet rs=pst.executeQuery("select * from laptop");
				while(rs.next())
				{
					System.out.println(rs.getString(1));
					System.out.println(rs.getInt(2));
					System.out.println(rs.getInt(3));
				}
			}
				
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		
		
		
		}

	
	}
	
	
	
	
	

