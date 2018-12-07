package com.informationcatalyst.JavaIntroTasks;

public class task9SumAndAverage {
	static int sum = 0;
	static int ave = 0;
	public static void main(String[] args) {
		for(int i = 1; i <= 100; ++i) {
			  sum = sum + i;
//			  ave = sum / 100;	//CM: This line is not really needed here but outside the loop because the average is
			  					//being calculated every single time rather than accumulated. I mean, it doesn't hurt
			  					//because the application is simple, but then you have things like access to databases
			  					//or calls to remote systems, then you must be careful with unnecessary calls.
		}
		ave = sum / 100;	
		System.out.println("The Sum of 1-100 = " + sum);
		System.out.println("The Average of the sum of 1-100 = " + ave);
	}
}
