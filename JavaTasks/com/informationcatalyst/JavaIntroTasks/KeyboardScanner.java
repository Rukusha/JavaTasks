package com.informationcatalyst.JavaIntroTasks;
import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		
		int userInt;
		double userDouble;
		String userString;
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Enter a int");
		userInt = userIn.nextInt();
		System.out.println(userInt);
		
	    System.out.println("Enter a Double");
		userDouble = userIn.nextDouble();
		System.out.println(userDouble);
		
		userIn.nextLine();
		System.out.println("Enter a String");
		userString = userIn.nextLine();
		System.out.println(userString);

		userIn.close();
	}
}

