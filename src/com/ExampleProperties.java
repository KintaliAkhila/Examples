package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class ExampleProperties {

	private static void saveProperties(Properties p,String fileName)
	{
		try
		{
			OutputStream propsFile=new FileOutputStream(fileName);
			p.store(propsFile, "Properties File To the Test Application");
			propsFile.close();
		
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
	}
		private static Properties loadProperties(String fileName)
		{
			Properties tempProp=new Properties();
			try {
				InputStream propsFile=new FileInputStream(fileName);
				tempProp.load(propsFile);
				propsFile.close();
			}
			catch(IOException ioe)
			{
				System.out.println(ioe);
		}
		return tempProp;
		}
		
		private static Properties createDefaultProperties() {
			Properties tempProp=new Properties();
			tempProp.setProperty("url","jdbc:oracle:thin:@192.168.12.16:1521:orcl");
			tempProp.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
			tempProp.setProperty("username", "trg");
			tempProp.setProperty("password", "tiger");
			return tempProp;
		}
		private static void printProperties(Properties p,String s) {
			
			
			
		}
		public static void main(String args[]) {
			final String PROPFILE="Myapplicatioon.properties";
			Properties myProp;
			Properties myNewProp;
			
			myProp=createDefaultProperties();
			printProperties(myProp,"Newly Created (Default) properties");
			
			saveProperties(myProp,PROPFILE);
			
			myNewProp=loadProperties(PROPFILE);
			printProperties(myNewProp,"loaded properties");
			
			saveProperties(myProp, PROPFILE);
			Properties myNewProp1=loadProperties(PROPFILE);
			Enumeration enProps=myNewProp1.propertyNames();
			
			String key="";
			String param[];
			param=new String[4];
			int i=0;
			while(enProps.hasMoreElements()) {
				
				key=(String)enProps.nextElement();
				System.out.println(key);
				param[i]=(String)myNewProp1.getProperty(key);
				System.out.println("" +key +"-->"+myNewProp1.getProperty(key));
				i++;
				
			}
			
	}
}
	

