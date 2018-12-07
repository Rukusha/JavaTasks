package com.informationcatalyst.JavaIntroTasks;
import java.util.Scanner;

public class task11reverseWhileDo {

	public static void main(String[] args) {
		
		String user;
		String reverse = "";
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Enter a String");
		user = userIn.nextLine();
		
		int length = user.length();
		
		/**
		 * CM: No. In this exercise you have to replace the FOR loop for a WHILE loop
		 * */
		
		while (length > 0) {
			reverse = reverse + user.charAt(length - 1);
		    length--; 
			userIn.close();
		}
		System.out.println("The reverse of the String " + reverse +".");

	}
}
