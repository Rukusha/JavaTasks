package com.informationcatalyst.JavaIntroTasks;
import java.util.Scanner;


public class task19radius {


	public static void main(String[] args) {

		int userInt;

		Scanner userIn = new Scanner(System.in);

	    System.out.println("Enter a radius");
		userInt = userIn.nextInt();
		System.out.println(userInt);
		userIn.nextLine();
		
		while(userInt != -1) {
			System.out.println("Incorrect radius please try again");
			System.out.println("Enter a radius");
			userInt = userIn.nextInt();
			
			System.out.println(userInt);
		}
//		{	//CM: These curly brackets (this line and two lines below) are not needed;
      		System.out.println("Congratulations you have enetered the correct radius");
//		}
		userIn.close();
	}
	
}

