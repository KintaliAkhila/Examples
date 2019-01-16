package com;

public class Replace {

	
	    public static void main(String[] args) {
	      String a = "lastavice trče";

	      for (int i=0; i < a.length(); i++){
	        if (i % 2 != 0){
	          a = a.substring(0,i-1) + "&" + a.substring(i, a.length());
	        }
	      }


	      System.out.println(a);

	    }
	}

