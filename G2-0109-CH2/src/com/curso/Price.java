package com.curso;

public class Price {
	
	int amount = 0b101;
	
	{
		String s = "Hello";
		System.out.print("BloqueInit: "+amount);
	}

	public static void main(String[] args) {
		new Price().admission();
	}
	
	public void admission() {
		//int amount = 0b11;
		//int amount = 0xE; //14
		//int amount = 1_2.0;
		//double amount = 1_0.0_0;
		
		System.out.print(amount);
	}
	
	
}
