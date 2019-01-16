package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
       
	
		public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
			Properties properties=new Properties();
			//File f=new File("resources/DB.properties");
			FileInputStream	fis=new FileInputStream("resources/db.properties");
				properties.load(fis);
				
				String driver=properties.getProperty("driver");
				String url=properties.getProperty("url");
				String username=properties.getProperty("username");
				String password=properties.getProperty("password");
				
					Class.forName(driver);
					Connection connection=DriverManager.getConnection(url,username,password);		
		
				return connection;
		
		}
		public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
			Connection c = getConnection();
			PreparedStatement pst = c.prepareStatement("insert into emp values(12,'dhf',7856)");
			pst.executeQuery();
			System.out.println("inserted successfully");
	}
	
}


