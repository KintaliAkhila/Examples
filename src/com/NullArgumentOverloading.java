package com;

public class NullArgumentOverloading {

	public static void main(String[] args) {

		NullArgumentOverloading obj = new NullArgumentOverloading();
		//obj.overLoad(null);
		obj.overLoad("scfjk");
	}

	private void overLoad(Object o) {
		System.out.println("Object o argument method.");
	}

	private void overLoad(double[] dArray) {
		System.out.println("double array argument method.");
	}
	public void overLoad(String str) {
		System.out.println("akhila");
	}

}