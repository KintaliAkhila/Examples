package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class File1Main {

	public static void main(String[] args) throws IOException {
		try(FileOutputStream fos=new FileOutputStream("File1");
		ObjectOutputStream oos=new ObjectOutputStream(fos);)
		{
			File1 f=new File1("dfcsd",44,76567);
		    
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
		try(FileInputStream fis=new FileInputStream("File1");
				ObjectInputStream oos=new ObjectInputStream(fis);)
				{
					
					File1 p=(File1)oos.readObject();
				   System.out.println(p);
				}
				catch(Exception e) {
					
					System.out.println(e.getMessage());
				}
		
		
	}
}
