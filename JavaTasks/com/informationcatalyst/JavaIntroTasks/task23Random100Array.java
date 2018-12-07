package com.informationcatalyst.JavaIntroTasks;

import java.util.Random;

public class task23Random100Array {
	public static void main(String[] args) {
			
		int[] randomNum = new int[100];

		Random ran = new Random();
    	int q = 0;
    	int j = 0;

		for(int i = 0; i < 100; i++) {
    		int answer = ran.nextInt(10) + 1;
			randomNum[i] = answer;
			int element = randomNum[q];
			q++;
			System.out.println(j + " = " + element);
			j++;
		}
		System.out.println("The length of the array is " +randomNum.length );

	}
}

