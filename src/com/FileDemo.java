package com;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		String input=args[0];
		File f=new File(input);
		f.createNewFile();
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.canRead());
		System.out.println(f.length());
	}
}
