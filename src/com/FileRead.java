package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
	
	public static void main(String[] args) throws IOException {
		
		try(FileReader inputStream=new FileReader("C:\\Users\\akintali\\eclipse-workspace\\Examples\\sample.txt");
				FileWriter outputStream=new FileWriter("C:\\Users\\akintali\\eclipse-workspace\\Examples\\sample.txt");)
		{
           int c;
           while((c=inputStream.read())!=-1)
           {
        	   outputStream.write(c);
           }
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
