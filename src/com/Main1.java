package com;

public class Main1 
{
	public static void main(String[] args) 
	{
		
		MtdOverriding mtdoverriding=new MtdOverriding();
		mtdoverriding.main("kintali");
		MtdOverloading mtdoverloading = new MtdOverloading();
		mtdoverloading.overLoad(null);
		mtdoverloading.main(5);
		
	}

}
