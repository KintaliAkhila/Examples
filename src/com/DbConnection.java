package com;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {
	
	public static void main(String[] args) throws ClassNotFoundException  {
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.224.226:1521:XE","system","pass");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg701","training701");
			//Statement st=con.createStatement();
			//st.execute("insert into emp values(1234,'akhila',15000)");
			//st.execute("insert into emp values(1235,'adarsh',150000)");
			//st.execute("delete from emp where empno=1234");
			//st.execute("update emp set empno=1236 where empname='adarsh'");
			PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
			pst.setInt(1,1237);
			ResultSet rs=pst.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
			}
		}
			
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
