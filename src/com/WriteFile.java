package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\akintali\\eclipse-workspace\\Examples\\sample.txt");
		String s="kintali";
		byte[] b=s.getBytes();
		fos.write(b);
		fos.close();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\akintali\\eclipse-workspace\\Examples\\sample.txt");
		int i=0;
		while((i=fis.read())!=-1)
		{
			
			System.out.print((char)i);
	   }
		fis.close();
	}
}
