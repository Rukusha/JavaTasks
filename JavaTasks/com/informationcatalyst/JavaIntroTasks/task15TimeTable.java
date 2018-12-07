package com.informationcatalyst.JavaIntroTasks;

public class task15TimeTable {
	public static void main(String[] args) {
	
	int topI;
	int sideI;
	System.out.print("*|1  2  3  4  5  6  7  8  9  \n");
	System.out.print("---------------------------- \n");
	for (topI = 1; topI <= 9; topI++) {
		System.out.print(topI +"|");
		for (sideI = 1; sideI <= 9; sideI++) {
			System.out.print((topI * sideI) +"  ");
			if (sideI % 9 == 0) {
				System.out.println("\n");
			}
		}
	}
	}
}

