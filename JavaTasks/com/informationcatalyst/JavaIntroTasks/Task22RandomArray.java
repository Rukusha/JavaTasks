package com.informationcatalyst.JavaIntroTasks;

import java.util.Random;

public class Task22RandomArray {
	public static void main(String[] args) {
		//CM: I spotted the error. I think I hadn't spotted it before because the indentation makes the code
		//difficult to read. Your array is never growing. You're basically getting a random number and adding
		//it to an array of size one then you're printing it immediately. Every loop you're overwriting the
		//number but it doesn't matter because you have already printed the previous one already. Please update
		//so that you get the random numbers first in an array, then you print them all at once.
		int[] randomNum = new int[10];

		Random ran = new Random();
    	int q = 0;
    	int j = 0;

		for(int i = 0; i < 10; i++) {
    		int answer = ran.nextInt(10) + 1;
			randomNum[i] = answer;
			int element = randomNum[q];
			q++;
			System.out.println(element);
			j++;
		}
	}
}
