package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileRead2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\akintali\\eclipse-workspace\\Examples\\sample.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(20);
		dos.write(18);
		dos.writeLong(45);
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\akintali\\eclipse-workspace\\Examples\\sample.txt");
		DataInputStream dis=new DataInputStream(fis);
		System.out.println(dis.readInt());
		System.out.println(dis.read());
		System.out.println(dis.readLong());
		int i=0;
		
		fis.close();
	}
}
