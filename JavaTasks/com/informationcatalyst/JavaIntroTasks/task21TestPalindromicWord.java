package com.informationcatalyst.JavaIntroTasks;
import java.util.Scanner;

public class task21TestPalindromicWord {
	public static void main(String[] args) {
		
		String userString;
		Scanner userIn = new Scanner(System.in);

		 System.out.println("Enter a Palendrome");
		    userString = userIn.nextLine();
		    
		    userString.toLowerCase();
		    
		    //CM: No, this one is wrong. A palindrome reads the same forwards and backwards.
		    //Below you're only comparing the first and last characters
		    int i = userString.length();
		    int j = 0;
		    int k = 1;
		    int n = 0;
		    while(k < i) {
			    if(userString.charAt(j) == userString.charAt(i - k)) {
			    	j++;
			    	k++;
			    }
			    else {
				    System.out.println(userString + " is not a palindrome");
				    n++;
				    break;
			    }
		    }
		    if(n == 0) {
			    System.out.println(userString + " is a palindrome");
		    }
		    userIn.close();
	}
}
