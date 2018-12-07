package com.informationcatalyst.JavaIntroTasks;

public class CheckMultipleConditions {
	public static void main(String[] args) {

	int number = 65;
	
	if (number % 2 > 0) {
		if (number > 9) {
			System.out.println("Big Odd Number");
		}
		else
		System.out.println("Small Odd Number");
	}
	else {
		System.out.println("Even Number");
	}

	System.out.println("BYE!");
//	System.exit(0);			//CM: If this is the last thing to be executed of the whole program, then this line is unnecessary 
}
}