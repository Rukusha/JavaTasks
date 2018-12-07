package com.informationcatalyst.JavaIntroTasks;
/**
 * CM: No. Here you should test the validity of each day of the week according to numbers, from 0 to 6 or Sunday to Saturday.
 * Any number outside this range is not a valid day
 * */
public class PrintDayInWord {
	public static void main(String[] args) {

	int day = 4;
	
	if (day ==  0) {
		System.out.println("Sunday");
		}
	else if (day == 1) {
		System.out.println("Monday");
	}
	else if (day == 2) {
		System.out.println("Tuesday");
	}
	else if (day == 3) {
		System.out.println("Wednesday");
	}
	else if (day == 4) {
		System.out.println("Thursday");
	}
	else if (day == 5) {
		System.out.println("Friday");
	}
	else if (day == 6) {
		System.out.println("Saturday");
	}
	else {
		System.out.println("Not a valid day");
	}
	}
}
