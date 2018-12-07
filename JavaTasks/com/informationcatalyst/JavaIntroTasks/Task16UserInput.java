package com.informationcatalyst.JavaIntroTasks;
import java.util.Scanner;

public class Task16UserInput {

	public static void main(String[] args) {
		
		int user;
		int square;
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Enter a number");
		user = userIn.nextInt();
		square = user * user;		//CM: Try not to indent lines that are not part of sub blocks of code.
										//This one should be at the same level of the previous one.
										//It improves readability.
		System.out.println("the Square of user is " + square +".");
		userIn.close();
		}
	}


	

