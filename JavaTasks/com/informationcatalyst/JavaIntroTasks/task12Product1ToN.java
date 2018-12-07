package com.informationcatalyst.JavaIntroTasks;

public class task12Product1ToN {

	static int product = 1;
	public static void main(String[] args) {
		for(int i = 1; i <= 14; ++i) {
			product = product * i ;

			if(i == 10) {
			System.out.println("The Product of 1 - 10 is = " + product);
			}
			else if(i == 11) {
				System.out.println("The Product of 1 - 11 is = " + product);
			}
			else if(i == 12) {
				System.out.println("The Product of 1 - 12 is = " + product);
			}
			else if(i == 13) {
				System.out.println("The Product of 1 - 13 is = " + product);
			}
			else if(i == 14) {
				System.out.println("The Product of 1 - 14 is = " + product);
			}
	}

}
}
