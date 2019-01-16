package util;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnMain {

	public static void main(String args[]) 
	{
	
		try {
			Connection con=DbConnection.getConnection();
			
			PreparedStatement pst=con.prepareStatement("insert into emp values(1002,'akhila')");			
			
			pst.execute();
			
			
			ResultSet rs=pst.executeQuery("select * from emp");
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
}
