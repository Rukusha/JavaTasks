package com.informationcatalyst.JavaIntroTasks;

import java.util.Random;

public class task24SortingArrays {
	public static void main(String[] args) {
		

		int[] randomNumOdd = new int[150];
		int[] randomNum = new int[150];
		
		Random ran = new Random();
		int i = 0;
    	int q = 0;
		int e = 0;
		int l = 0;
    	int p = 0;
    	int answer;
    	
		//CM: No. While it does the trick, it doesn't show what we're
		//looking for in your programming skills. Try to generate the
		//random number then allocate it to the right array. Once you're
		//done print one of the arrays all in one line, then do the same
		//with the other array in a new line
    	
		while(i <= 100) {
			i++;
    		answer = ran.nextInt(100) + 1;
				if(answer % 2 == 0) {
					randomNum[p] = answer;
					p++;
		        }
				if(answer % 2 > 0) {
					randomNumOdd[q] = answer;
			    	q++;
		        }
	    }
		System.out.println("Even Array");
		
		for (l = 0; l <= (q - 1); l++) {
			System.out.print(randomNum[l] + ", ");
		}
		
		System.out.println(" ");
		System.out.println("Odd Array");
		
		for (e = 0; e <= (q - 1); e++) {
			System.out.print(randomNumOdd[e] + ", ");
		}
	}
}

