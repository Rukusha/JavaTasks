package com.informationcatalyst.JavaIntroTasks;

public class task14ExtractDigits {

	public static void main(String[] args) {

		int i = 15423;
		
		while (i > 0) {
		  int div = i / 10;
		  int times = (i - (div * 10));
		  i = div;
		  System.out.print(times + " ");
		}
	}
}
