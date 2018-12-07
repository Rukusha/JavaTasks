package com.informationcatalyst.JavaIntroTasks;
import java.util.Scanner;


import java.util.Scanner;

public class task17Square {


	public static void main(String[] args) {
		
		int user;
		int square;
		Scanner userIn = new Scanner(System.in);
		
		System.out.println("Enter a number");
		user = userIn.nextInt();
		square = user;
		for (int i = 1; i <= square; ++i) {
//			square = user * user;	//CM: This is a dangerous move. This operation only needs to be done once
									//before the loop since the square doesn't need to be re calculated.
									//It's a dangerous move since in this code it's a key operation because
									//it's the one producing the result, so it shouldn't be re calculated
									//unnecessarily
			System.out.println(i);
		}
		square = user * user;
        System.out.println("the Square of user is " + square +".");
		userIn.close();
	}
}


	