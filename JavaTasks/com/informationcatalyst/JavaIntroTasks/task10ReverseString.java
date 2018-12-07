package com.informationcatalyst.JavaIntroTasks;
import java.util.Scanner;

public class task10ReverseString {

	public static void main(String[] args) {
		
		String user;
		String reverse = "";
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Enter a String");
		user = userIn.nextLine();
		
		int length = user.length();
		
		for(int i = length - 1; i >= 0; --i) {
			reverse = reverse + user.charAt(i);
		}
		System.out.println("The reverse of the String " + reverse +".");
		userIn.close();
		}
	}


	

