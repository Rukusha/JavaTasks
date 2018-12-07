package com.informationcatalyst.JavaIntroTasks;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class task20CheckVowelsDigits {

	public static void main(String[] args) {

		String userString;
		int StringCounter = 0;
		int IntCounter = 0;
		int TotalCount = 0;
		int i = 0;

		Scanner userIn = new Scanner(System.in);

	    System.out.println("Enter a String");
	    userString = userIn.nextLine();
		
		userString.toLowerCase();
		//CM: when traversing arrays and strings (strings are arrays of characters) ALWAYS start your loops
		//from 0. This is a non-written rule of programming. Otherwise you'll be referring to the previous
		//character (like you do below) which is source of potential mistakes.
//		for (int i = 0; i <= userString.length(); i++) {
			//CM: When comparing the same variable against different possible values, use a switch block
			//instead (google java switch statement)
//			if(userString.charAt(i - 1) == 'e' | (userString.charAt(i - 1) == 'i' | (userString.charAt(i - 1) == 'o' | (userString.charAt(i - 1) == 'u' | (userString.charAt(i - 1) == 'a'))))){
//				//CM: you don't need to call the lowercase method every single time. The first is sufficient
//				StringCounter++;	
//			}
		while (i < userString.length()){

			switch (userString.charAt(i)) {
            case 'e':  StringCounter++;
		                i++; 
            		break;
            case 'a':  StringCounter++;
            			i++; 
            		break;
            case 'i':  StringCounter++;
            			i++; 
            		break;
            case 'o':  StringCounter++;
            			i++; 
            		break;
            case 'u':  StringCounter++;
            			i++; 
    				break;

			//CM: Same applies here. Please update your code with a switch statement
//			else if (userString.charAt(i - 1) == '0' |(userString.charAt(i - 1) == '1' | (userString.charAt(i - 1) == '2' | (userString.charAt(i - 1) == '3' | (userString.charAt(i - 1) == '4' | (userString.charAt(i - 1) == '5' | (userString.charAt(i - 1) == '6' | (userString.charAt(i - 1) == '6' | (userString.charAt(i - 1) == '7' | (userString.charAt(i - 1) == '8' | (userString.charAt(i - 1) == '9'))))))))))) {
//				IntCounter++;
//			}
            case '1': IntCounter++;
            			i++; 
            		 break;
            case '2': IntCounter++;
						i++; 
            		 break;
            case '3': IntCounter++;
            			i++; 
            		 break;
            case '4': IntCounter++;
						i++; 
            		 break;
            case '5': IntCounter++;
            			i++; 
    				 break;
            case '6': IntCounter++;
            			i++; 
		   		     break;
		    case '7': IntCounter++;
		    			i++; 
		     		 break;
		    case '8': IntCounter++;
		    			i++; 
		   	    	 break;
		    case '9': IntCounter++;
						i++; 
		   			 break;
		    case '0': IntCounter++;
						i++; 
					 break;
            default: i++;
            	break;
			}
		}
		TotalCount = IntCounter + StringCounter;
		
		double TotalPer = (IntCounter * 100) / TotalCount;
	
		NumberFormat TotalPerf = new DecimalFormat("#0.00");     
        
		System.out.println(userString + " Has " + StringCounter + " Vowels and "+ IntCounter + " Numbers with the Numbers making up " + TotalPerf.format(TotalPer) + "% of the total" );
		userIn.close();
	}
	
}
	
